package strategy2;

import java.util.ArrayList;
import java.util.List;

class SortedList
{
    private List<String> list = new ArrayList<>();
    private SortStrategy sortstrategy;

    public void setSortStrategy(SortStrategy sortstrategy)
    {
        this.sortstrategy = sortstrategy;
    }

    public void add(String name)
    {
        list.add(name);
    }

    public void sort()
    {
        sortstrategy.Sort(list);
        // Iterate over list and display results
        for(String name : list)
        {
            System.out.print(" " + name);
        }
        System.out.println();
    }
}