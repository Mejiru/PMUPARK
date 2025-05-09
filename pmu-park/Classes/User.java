import java.time.LocalDateTime;
import java.util.List;

public class Vehicle {
    private String id;
    private String licensePlate;
    private String model;
    private String color;

    public Vehicle() {}
    public Vehicle(String id, String licensePlate, String model, String color) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.model = model;
        this.color = color;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

public class Reservation {
    private String id;
    private String spotId;
    private TimeSlot timeSlot;
    private String userId;

    public Reservation() {}
    public Reservation(String id, String spotId, TimeSlot timeSlot, String userId) {
        this.id = id;
        this.spotId = spotId;
        this.timeSlot = timeSlot;
        this.userId = userId;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSpotId() { return spotId; }
    public void setSpotId(String spotId) { this.spotId = spotId; }
    public TimeSlot getTimeSlot() { return timeSlot; }
    public void setTimeSlot(TimeSlot timeSlot) { this.timeSlot = timeSlot; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}

public class ParkingSpot {
    private String id;
    private String type; 
    private String location;
    private String status;

    public ParkingSpot() {}
    public ParkingSpot(String id, String type, String location, String status) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.status = status;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

public class Notification {
    private String id;
    private String message;
    private LocalDateTime timestamp;
    private boolean read;

    public Notification() {}
    public Notification(String id, String message, LocalDateTime timestamp, boolean read) {
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
        this.read = read;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public boolean isRead() { return read; }
    public void setRead(boolean read) { this.read = read; }
}

public class Report {
    private String id;
    private String description;
    private String reportedByUserId;
    private String reportedUserId;
    private LocalDateTime timestamp;

    public Report() {}
    public Report(String id, String description, String reportedByUserId, String reportedUserId, LocalDateTime timestamp) {
        this.id = id;
        this.description = description;
        this.reportedByUserId = reportedByUserId;
        this.reportedUserId = reportedUserId;
        this.timestamp = timestamp;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getReportedByUserId() { return reportedByUserId; }
    public void setReportedByUserId(String reportedByUserId) { this.reportedByUserId = reportedByUserId; }
    public String getReportedUserId() { return reportedUserId; }
    public void setReportedUserId(String reportedUserId) { this.reportedUserId = reportedUserId; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}

public class ParkingLot {
    private String id;
    private String name;
    private boolean isOpen;
    private List<ParkingSpot> spots;

    public ParkingLot() {}
    public ParkingLot(String id, String name, boolean isOpen, List<ParkingSpot> spots) {
        this.id = id;
        this.name = name;
        this.isOpen = isOpen;
        this.spots = spots;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean isOpen() { return isOpen; }
    public void setOpen(boolean open) { isOpen = open; }
    public List<ParkingSpot> getSpots() { return spots; }
    public void setSpots(List<ParkingSpot> spots) { this.spots = spots; }
}

public class TimeSlot {
    private LocalDateTime start;
    private LocalDateTime end;

    public TimeSlot() {}
    public TimeSlot(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }
    public LocalDateTime getStart() { return start; }
    public void setStart(LocalDateTime start) { this.start = start; }
    public LocalDateTime getEnd() { return end; }
    public void setEnd(LocalDateTime end) { this.end = end; }
}

public class SystemActivity {
    private String id;
    private String activity;
    private LocalDateTime timestamp;

    public SystemActivity() {}
    public SystemActivity(String id, String activity, LocalDateTime timestamp) {
        this.id = id;
        this.activity = activity;
        this.timestamp = timestamp;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}