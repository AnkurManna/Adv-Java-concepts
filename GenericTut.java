import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Building
{
    @Override
    public String toString()
    {
        //System.out.println("building");
        return "building";
    }
}
class Office extends Building
{
    @Override
    public String toString()
    {
        //System.out.println("building");
        return "office";
    }
}
class House extends Building
{
    @Override
    public String toString()
    {
        //System.out.println("building");
        return "house";
    }
}
public  class GenericTut
{
    public static void episode1()
    {
        System.out.println("Hello");
        List Names = new ArrayList();
        Names.add("Okk");
        Names.add(4);

        System.out.println(Names.get(1));
    }
    /* <T> is generic type can accept anyThing and locally scoped
    we can use it in signature and function body*/
    public static <T> List<T> arrayToList(T[] array , List<T> list)
    {
        for(T object : array)
            list.add(object);
        return list;
    }
    public static void episode2()
    {
        Character[]  charArray = {'h' , 'e' , 'l'};
        Integer[] intArray = {1,2,3,4,5};
        Boolean[] boolArray = {true,true,false};

        List<Character> charList = arrayToList(charArray,new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray,new ArrayList<>());
        List<Integer> intList = arrayToList(intArray,new ArrayList<>());
    }
    /* This is varArg , it internally generates an array of items */
    public static void printShoppingList(String... items)
    {
        for(int i=0;i< items.length;i++)
            System.out.println(items[i]);
    }
    public  static void episode3()
    {
    printShoppingList("oil","egg","bread");
    printShoppingList("spices");
    }
    public static void build(Building b)
    {
        System.out.println(b.toString());
    }
    public  static void build(List<Building>list)
    {
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
    public  static void episode4()
    {
        Building b = new Building();
        Office o = new Office();
        build(b);
        build(o);
        List<Building> list = new ArrayList<>();
        list.add(b);
        list.add(o);
        build(list);


        List<Office> list1 = new ArrayList<>();

        list1.add(o);
        //this wont work here office List cant be assigned to Building list
        // build(list1);

    }
    public static void buildWithWildCard(List<? extends Building>list)
    {
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i).toString());
    }
    public static void buildWithSuperWildCard(List<? super House> list)
    {
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i).toString());
    }
    public static void episode5()
    {
        Building b = new Building();
        Office o = new Office();
        House h = new House();

        List<Office> list = new ArrayList<>();
        list.add(o);
        List<House> list1 = new ArrayList<>();
        list1.add(h);

        buildWithWildCard(list);
        buildWithWildCard(list1);

        List<Building> listb = new ArrayList<>();
        listb.add(b);
        listb.add(b);
        buildWithSuperWildCard(listb);



    }
    public  static  void  main(String[] args)
    {
        // episode1();
        // episode2();
        // episode3();
        //episode4();
        episode5();
    }
}