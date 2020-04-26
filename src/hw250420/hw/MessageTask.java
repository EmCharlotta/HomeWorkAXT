package hw250420.hw;

import java.util.List;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        int i=0;
        for (MessagePriority mp : MessagePriority.values()) {
            i = 0;
            for (Message m : messageList) {
                if (m.getPriority().equals(mp)) {
                    i++;
                }
            }
            System.out.println(i + " сообщений приоритета " + mp);
        }
    }

    public static void countEachCode(List<Message> messageList) {
        int j = 0;
        for (int i = 0; i<10; i++){
            j=0;
            for (Message m : messageList) {
                if (m.getCode() == i){
                    j++;
                }
            }
            System.out.println(j + " сообщений с кодом " + i);
        }
    }

    private static void uniqueMessageCount(List<Message> messageList) {
        int a = messageList.size();
    for (int i = 0; i<messageList.size(); i++){
        for (int j = i+1; j<messageList.size(); j++) {
            if (messageList.get(i).getCode()==messageList.get(j).getCode()
                    && messageList.get(i).getPriority().equals(messageList.get(j).getPriority())){
                a-=1;
                break;
            }
        }
        }
        System.out.println(a + " уникальных значений");
    }


    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        for (int i = 0; i < messageList.size(); i++) {
            for (int j = i + 1; j < messageList.size(); j++) {
                if (messageList.get(i).getCode() == messageList.get(j).getCode()
                        && messageList.get(i).getPriority().equals(messageList.get(j).getPriority())) {
                    messageList.remove(i);
                    break;
                }
            }
        }
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        System.out.println(messageList);
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority().equals(priority)){
                messageList.remove(i);
                i--;
            }
        }
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        System.out.println(messageList);
        for (int i = 0; i < messageList.size(); i++) {
            if (!messageList.get(i).getPriority().equals(priority)){
                messageList.remove(i);
                i--;
            }
        }
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = MessageGenerator.generate(10);
        countEachPriority(messages);
        countEachCode(messages);
        PriorityComparator priorityComparator = new PriorityComparator();
        messages.sort(priorityComparator);
        //uniqueMessageCount(messages);
        uniqueMessagesInOriginalOrder(messages);
        removeEach(messages, MessagePriority.URGENT);
        removeOther(messages, MessagePriority.LOW);
    }
}

