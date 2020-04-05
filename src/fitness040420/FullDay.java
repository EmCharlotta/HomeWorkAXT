package fitness040420;

import java.time.LocalTime;

public class FullDay extends Subscription {
    private LocalTime startTime = LocalTime.of(07,59);
    private LocalTime endTime = LocalTime.of(22,01);

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
