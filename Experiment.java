package exp01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


public class Experiment {

    // Create an array from 0 to size-1
    private static Integer[] createBestCaseArray(int size) {
        Integer[] newArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = Integer.valueOf(i);
        }
        return newArray;
    }

    // Create an array from size-1 to 0
    private static Integer[] createWorstCaseArray(int size) {
        Integer[] newArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = Integer.valueOf(size - i - 1);
        }
        return newArray;
    }

    // Create an array with elements 0 to size-1 and then randomly shuffle them around
    private static Integer[] createRandomCaseArray(int size) {
        Integer[] newArray = new Integer[size];
        //int[] newArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            newArray[i] = Integer.valueOf(i);
        }

        for (int i = 0; i < size; i++) {
            int randomIndex = rand.nextInt(size);

            // Swap the elements
            int temp = newArray[i];
            newArray[i] = newArray[randomIndex];
            newArray[randomIndex] = temp;

        }

        return newArray;
    }


    private static void testBubbleSortPassPerItem(HashMap<String, Long> passPerItemTimes, int[] sizes, Integer[][] arrays) {

        BubbleSortPassPerItem<Integer> passPerItemSorter = new BubbleSortPassPerItem<>();
        long start;
        long end;


        // best
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[0], size);
            start = System.nanoTime();
            passPerItemSorter.sort(tmp);
            end = System.nanoTime();            
            passPerItemTimes.put("best" + "_"  + size, end - start);
        }
        System.out.println("best");

        // worst
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[1], size);
            start = System.nanoTime();
            passPerItemSorter.sort(tmp);
            end = System.nanoTime();            
            passPerItemTimes.put("worst" + "_"  + size, end - start);
        }
        System.out.println("worst");

        // rand1
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[2], size);
            start = System.nanoTime();
            passPerItemSorter.sort(tmp);
            end = System.nanoTime();            
            passPerItemTimes.put("rand1" + "_"  + size, end - start);
        }
        System.out.println("rand1");

        // rand2
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[3], size);
            start = System.nanoTime();
            passPerItemSorter.sort(tmp);
            end = System.nanoTime();            
            passPerItemTimes.put("rand2" + "_"  + size, end - start);
        }
        System.out.println("rand2");

        // rand3
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[4], size);
            start = System.nanoTime();
            passPerItemSorter.sort(tmp);
            end = System.nanoTime();            
            passPerItemTimes.put("rand3" + "_"  + size, end - start);
        }
        System.out.println("rand3");
        
    }
    
    private static void testBubbleSortUntilNoChange(HashMap<String, Long> untilNoChangeTimes, int[] sizes, Integer[][] arrays) {
        
        BubbleSortUntilNoChange<Integer> untilNoChangeSorter = new BubbleSortUntilNoChange<>();

        long start;
        long end;

        
        // best
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[0], size);
            start = System.nanoTime();
            untilNoChangeSorter.sort(tmp);
            end = System.nanoTime();            
            untilNoChangeTimes.put("best" + "_"  + size, end - start);
        }
        System.out.println("best");

        // worst
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[1], size);
            start = System.nanoTime();
            untilNoChangeSorter.sort(tmp);
            end = System.nanoTime();            
            untilNoChangeTimes.put("worst" + "_"  + size, end - start);
        }
        System.out.println("worst");

        // rand1
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[2], size);
            start = System.nanoTime();
            untilNoChangeSorter.sort(tmp);
            end = System.nanoTime();            
            untilNoChangeTimes.put("rand1" + "_"  + size, end - start);
        }
        System.out.println("rand1");

        // rand2
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[3], size);
            start = System.nanoTime();
            untilNoChangeSorter.sort(tmp);
            end = System.nanoTime();            
            untilNoChangeTimes.put("rand2" + "_"  + size, end - start);
        }
        System.out.println("rand2");

        // rand3
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[4], size);
            start = System.nanoTime();
            untilNoChangeSorter.sort(tmp);
            end = System.nanoTime();            
            untilNoChangeTimes.put("rand3" + "_"  + size, end - start);
        }
        System.out.println("rand3");
        
    }

    private static void testBubbleSortWhileNeeded(HashMap<String, Long> whileNeededTimes, int[] sizes, Integer[][] arrays) {
        
        BubbleSortWhileNeeded<Integer> whileNeededSorter = new BubbleSortWhileNeeded<>();

        long start;
        long end;

        
        // best
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[0], size);
            start = System.nanoTime();
            whileNeededSorter.sort(tmp);
            end = System.nanoTime();            
            whileNeededTimes.put("best" + "_"  + size, end - start);
        }
        System.out.println("best");

        // worst
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[1], size);
            start = System.nanoTime();
            whileNeededSorter.sort(tmp);
            end = System.nanoTime();            
            whileNeededTimes.put("worst" + "_"  + size, end - start);
        }
        System.out.println("worst");

        // rand1
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[2], size);
            start = System.nanoTime();
            whileNeededSorter.sort(tmp);
            end = System.nanoTime();            
            whileNeededTimes.put("rand1" + "_"  + size, end - start);
        }
        System.out.println("rand1");

        // rand2
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[3], size);
            start = System.nanoTime();
            whileNeededSorter.sort(tmp);
            end = System.nanoTime();            
            whileNeededTimes.put("rand2" + "_"  + size, end - start);
        }
        System.out.println("rand2");

        // rand3
        for (int size : sizes) {
            Integer[] tmp = Arrays.copyOf(arrays[4], size);
            start = System.nanoTime();
            whileNeededSorter.sort(tmp);
            end = System.nanoTime();            
            whileNeededTimes.put("rand3" + "_"  + size, end - start);
        }
        System.out.println("rand3");
        
    }


    private static void writeHashMapToCsv(HashMap<String, Long> dataMap, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write CSV header
            writer.write("Type,Size,Time\n");

            // Write data to CSV
            for (HashMap.Entry<String, Long> entry : dataMap.entrySet()) {
                System.out.println(entry.getKey());
                String[] tmp = entry.getKey().split("_");
                writer.write(tmp[0] + "," + tmp[1] + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {}
    }
    
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000};
        int s = sizes.length-1;
        //String[] types = {"best, worst, rand1, rand2, rand3"};

        Integer[] bestCaseArray = createBestCaseArray(sizes[s]);
        Integer[] randomCaseArray1 = createRandomCaseArray(sizes[s]);
        Integer[] randomCaseArray2 = createRandomCaseArray(sizes[s]);
        Integer[] randomCaseArray3 = createRandomCaseArray(sizes[s]);

        // BubbleSortPassPerItem
        // here we map given type of array to other map
        HashMap<String, Long> passPerItemTimes = new HashMap<>();

        Integer[][] passPerItemTestArrays = {bestCaseArray, 
                                            createWorstCaseArray(sizes[s]), 
                                            Arrays.copyOf(randomCaseArray1, sizes[s]), 
                                            Arrays.copyOf(randomCaseArray2, sizes[s]), 
                                            Arrays.copyOf(randomCaseArray3, sizes[s])};

        testBubbleSortPassPerItem(passPerItemTimes, sizes, passPerItemTestArrays);
        //List<String> list = new ArrayList<String>(passPerItemTimes.keySet());
        //System.out.println(Arrays.toString(list.toArray()));

        // BubbleSortUntilNoChange
        HashMap<String, Long> untilNoChangeTimes = new HashMap<>();
        Integer[][] untilNoChangeTestArrays = {bestCaseArray, 
                                                createWorstCaseArray(sizes[s]), 
                                                Arrays.copyOf(randomCaseArray1, sizes[s]), 
                                                Arrays.copyOf(randomCaseArray2, sizes[s]), 
                                                Arrays.copyOf(randomCaseArray3, sizes[s])};

        testBubbleSortUntilNoChange(untilNoChangeTimes, sizes, untilNoChangeTestArrays);
        //List<String> list = new ArrayList<String>(untilNoChangeTimes.keySet());
        //System.out.println(Arrays.toString(list.toArray()));

        // BubbleSortWhileNeeded
        HashMap<String, Long> whileNeededTimes = new HashMap<>();
        Integer[][] whileNeededTestArrays = {bestCaseArray, 
                                                createWorstCaseArray(sizes[s]), 
                                                Arrays.copyOf(randomCaseArray1, sizes[s]), 
                                                Arrays.copyOf(randomCaseArray2, sizes[s]), 
                                                Arrays.copyOf(randomCaseArray3, sizes[s])};

        testBubbleSortWhileNeeded(whileNeededTimes, sizes, whileNeededTestArrays);
        //List<String> list = new ArrayList<String>(untilNoChangeTimes.keySet());
        //System.out.println(Arrays.toString(list.toArray()));

        writeHashMapToCsv(passPerItemTimes, "./passPerItemTimes.csv");
        writeHashMapToCsv(untilNoChangeTimes, "./untilNoChangeTimes.csv");
        writeHashMapToCsv(whileNeededTimes, "./whileNeededTimes.csv");
    }
}