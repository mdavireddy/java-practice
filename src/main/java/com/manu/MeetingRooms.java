package com.manu;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {


    public static int mostBooked(int n, int[][] meetings) {
        //[[1,20],[2,10],[3,5],[4,9],[6,8]]
        if (meetings.length == 0) {
            return 0;
        }
        Arrays.sort(meetings, Comparator.comparingInt(o -> o[0]));

        int[] meetingsHeld = new int[n];
        int[] meetingEnds = new int[n];

        for (int[] meeting : meetings) {
            int freeRoom = -1;
            for (int i = 0; i < n; i++) {
                if (meetingsHeld[i] == 0) {//no meeting allocated yet
                    freeRoom = i;
                    break;
                }
            }
            int leastMeetingsEnd = Integer.MAX_VALUE;
            if (freeRoom == -1) {
                for (int i = 0; i < n; i++) {
                    if (meetingEnds[i] < leastMeetingsEnd) {
                        freeRoom = i;
                        leastMeetingsEnd = meetingEnds[i];
                    }
                }
            }
            meetingsHeld[freeRoom]++;
            if (meetingEnds[freeRoom] != 0) {
                meetingEnds[freeRoom] = meetingEnds[freeRoom] + meeting[1] - meeting[0];
            } else {
                meetingEnds[freeRoom] = meeting[1];
            }
        }

        int maxMeetingCount = 0, maxMeetingCountRoom = 0;
        for (int i = 0; i < n; i++) {
            if(meetingsHeld[i]>maxMeetingCount){
                maxMeetingCount = meetingsHeld[i];
                maxMeetingCountRoom = i;
            }


        }
        return maxMeetingCountRoom;
    }


    public static void main(String[] args) {

        int[][] meetings = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        System.out.println(mostBooked(3, meetings));
    }
}
