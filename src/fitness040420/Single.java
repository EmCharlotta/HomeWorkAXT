package fitness040420;

import java.time.LocalDate;
import java.time.LocalTime;

public class Single extends Subscription {
    private LocalTime startTime = LocalTime.of(07,59);
    private LocalTime endTime = LocalTime.of(22,01);

    @Override
    public LocalDate getEndDate() {
        return super.getStartDate();
    }

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
