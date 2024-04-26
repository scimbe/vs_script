public class SchalterLocal impplements Schalter{
    public void toggleLampe()        
        LampenService lampenService = LampenService.getInstance();
        lampenService.toggleLampe();
    }
}
