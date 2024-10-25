package com.thebrandonhoward.cupofjava.challenges;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));
        System.out.println(topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> topList = new ArrayList<>();
        Map<String,Integer> wordsMap = new HashMap<>();

        for(int i=0; i<words.length; i++) {
            wordsMap.put(words[i], wordsMap.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int o1size = wordsMap.get(o1);
            int o2size = wordsMap.get(o2);

            if(o1size == o2size)
                return o2.compareTo(o1);

            return o1size - o2size;
        });

        for(Map.Entry<String,Integer> entry: wordsMap.entrySet()) {
            priorityQueue.add(entry.getKey());

            if(priorityQueue.size() > k)
                priorityQueue.poll();
        }

        while(!priorityQueue.isEmpty()) {
            topList.add(priorityQueue.poll());
        }

        return topList.reversed();
    }

}
