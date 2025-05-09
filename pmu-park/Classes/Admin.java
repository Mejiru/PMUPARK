import java.util.List;
import java.util.Locale;

public class Admin extends User {
    private List<Report> reviewedReports;
    private List<ParkingLot> managedLots;

    public Admin() {}

    public Admin(String id, String name, String email, String passwordHash, String phoneNumber, Locale languagePreference) {
        super(id, name, email, passwordHash, phoneNumber, languagePreference);
    }

    
    public List<Report> getReviewedReports() { return reviewedReports; }
    public void setReviewedReports(List<Report> reviewedReports) { this.reviewedReports = reviewedReports; }
    public List<ParkingLot> getManagedLots() { return managedLots; }
    public void setManagedLots(List<ParkingLot> managedLots) { this.managedLots = managedLots; }

    
    public void manageUserAccount(User user) {}
    public void manageReservation(Reservation reservation) {}
    public void openLot(String lotId) {}
    public void closeLot(String lotId) {}
    public void updateParkingArea(ParkingLot lot) {}
    public void reviewReport(Report report) {}
    public void enforceRule(String ruleId, User user) {}
    public void scheduleLotClosure(String lotId, TimeSlot timeSlot, String reason) {}
    public void notifyUsersOfClosure(String lotId) {}
    public List<SystemActivity> viewSystemActivity() { return null; }
}