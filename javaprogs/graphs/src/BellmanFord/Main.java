package BellmanFord;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void bellmanFord(List<Edge> edges, int source, int n)
    {
        // Distance[] и parent[] сохраняют кратчайший путь
        // (наименьшая стоимость/путь) информация
        int distance[] = new int[n];
        int parent[] = new int[n];

        // инициализируем `distance[]` и `parent[]`. Изначально все вершины
        // за исключением исходной вершины с весом INFINITY и отсутствием родителя
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        Arrays.fill(parent, -1);

        // шаг релаксации (выполнить V-1 раз)
        for (int i = 0; i < n - 1; i++)
        {
            for (Edge edge: edges)
            {
                // ребро от `u` до `v` с весом `w`
                int u = edge.source;
                int v = edge.dest;
                int w = edge.weight;

                // если расстояние до пункта назначения `v` может быть
                // укорачивается за счет ребра (u, v)
                if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v])
                {
                    // обновить расстояние до нового меньшего значения
                    distance[v] = distance[u] + w;

                    // установить родителя v как `u`
                    parent[v] = u;
                }
            }
        }

        // выполнить шаг релаксации еще раз в n-й раз, чтобы
        // проверка циклов с отрицательным весом
        for (Edge edge: edges)
        {
            // ребро от `u` до `v` с весом `w`
            int u = edge.source;
            int v = edge.dest;
            int w = edge.weight;

            // если расстояние до пункта назначения `u` может быть
            // укорачивается за счет ребра (u, v)
            if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v])
            {
                System.out.println("Negative-weight cycle is found!!");
                return;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (i != source && distance[i] < Integer.MAX_VALUE) {
                List<Integer> path = new ArrayList<>();

                System.out.println("The distance of vertex " + i + " from vertex " +
                        source + " is " + distance[i]);
            }
        }
    }
    public static void main(String[] args) {

        List<Edge> edges = Arrays.asList(
                // (x, y, w) —> ребро от `x` до `y` с весом `w`
                new Edge(0, 1, -1), new Edge(0, 2, 4), new Edge(1, 2, 3),
                new Edge(1, 3, 2), new Edge(1, 4, 2), new Edge(3, 2, 5),
                new Edge(3, 1, 1), new Edge(4, 3, -3 )
        );

        // устанавливаем максимальное количество узлов в Graph
        int n = 5;

        // запускаем алгоритм Беллмана-Форда с каждого узла
        for (int source = 0; source < n; source++) {
            bellmanFord(edges, source, n);
        }
    }
}
