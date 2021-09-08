package hotelbooking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class RoomBooking {

   private String name, ic, contact, email;
   protected int start, duration, end;

   public RoomBooking(String name, String ic, String contact, String email) {
      this.name = name;
      this.ic = ic;
      this.contact = contact;
      this.email = email;
   }

   public RoomBooking(int start, int duration, int end) {
      this.start = start;
      this.duration = duration;
      this.end = end;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getIc() {
      return ic;
   }

   public void setIc(String ic) {
      this.ic = ic;
   }

   public String getContact() {
      return contact;
   }

   public void setContact(String contact) {
      this.contact = contact;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getStart() {
      return start;
   }

   public void setStart(int start) {
      this.start = start;
   }

   public int getDuration() {
      return duration;
   }

   public void setDuration(int duration) {
      this.duration = duration;
   }

   public int getEnd() {
      return end;
   }

   public void setEnd(int end) {
      this.end = end;
   }

   public int end() {
      int end = start + duration;
      return end;
   }

   //Room check with roomno
   public boolean roomCheck(String roomno, int end) {
      boolean found = false;
      try {
         File file = new File(roomno + ".txt");
         Scanner x = new Scanner(file);
         while (x.hasNext()) {// To check if dates overlap
            int tempStart = x.nextInt();
            x.nextLine();
            int tempEnd = x.nextInt();
            x.nextLine();
            x.nextLine();
            x.nextLine();
            x.nextLine();
            x.nextLine();
            if (start == tempStart || end == tempEnd || (start >= tempStart && start < tempEnd)
                    || (end > tempStart && end <= tempEnd)) {
               found = true;
            }
         }
         x.close();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(RoomBooking.class.getName()).log(Level.SEVERE, null, ex);
      }
      return found;
   }

   //Room check without roomno 
   public boolean roomCheck(Scanner x, int end) {
      boolean found = false;
      while (x.hasNext()) {// To check if dates overlap
         int tempStart = x.nextInt();
         x.nextLine();
         int tempEnd = x.nextInt();
         x.nextLine();
         x.nextLine();
         x.nextLine();
         x.nextLine();
         x.nextLine();
         if (start == tempStart || end == tempEnd || (start >= tempStart && start < tempEnd)
                 || (end > tempStart && end <= tempEnd)) {
            found = true;
         }
      }
      x.close();
      return found;
   }

   //Room check without room 
   public boolean icCheck(String roomno, String ic) {
      boolean found = false;
      try {

         File file = new File(roomno + ".txt");
         Scanner x = new Scanner(file);
         while (x.hasNext()) {// To check if dates overlap
            x.nextLine();
            x.nextLine();
            x.nextLine();
            String icexist = x.nextLine().trim();
            x.nextLine();
            x.nextLine();
            if (icexist.equals(ic)) {
               found = true;
            }
         }
         x.close();

      } catch (FileNotFoundException ex) {
         Logger.getLogger(RoomBooking.class.getName()).log(Level.SEVERE, null, ex);
      }
      return found;
   }
}

class RoomNo extends RoomBooking {

   private int roomno;

   public RoomNo(int roomno, int start, int duration, int end) {
      super(start, duration, end);
      this.roomno = roomno;
   }

   public int getRoomno() {
      return roomno;
   }

   public void setRoomno(int roomno) {
      this.roomno = roomno;
   }

   public int getStart() {
      return start;
   }

   public void setStart(int start) {
      this.start = start;
   }

   public int getDuration() {
      return duration;
   }

   public void setDuration(int duration) {
      this.duration = duration;
   }

   public int getEnd() {
      return end;
   }

   public void setEnd(int end) {
      this.end = end;
   }

   public void editRecord(String filepath, String newstart, String newend, String newname, String newic, String newcontact, String newemail) {
      String tempFile = "temp.txt";
      File oldFile = new File(filepath);
      File newFile = new File(tempFile);
      String start = "";
      String end = "";
      String name = "";
      String ic = "";
      String contact = "";
      String email = "";

      try {
         FileWriter fw = new FileWriter(tempFile, true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);
         Scanner x = new Scanner(new File(filepath));

         while (x.hasNext()) {
            start = x.nextLine().trim();
            end = x.nextLine().trim();
            name = x.nextLine();
            ic = x.nextLine().trim();
            contact = x.nextLine().trim();
            email = x.nextLine().trim();

            if (newic.equals(ic)) {
               pw.println(newstart);
               pw.println(newend);
               pw.println(newname);
               pw.println(newic);
               pw.println(newcontact);
               pw.println(newemail);
            } else {
               pw.println(start);
               pw.println(end);
               pw.println(name);
               pw.println(ic);
               pw.println(contact);
               pw.println(email);
            }
         }
         x.close();
         bw.close();
         fw.close();
         pw.flush();
         pw.close();
         oldFile.delete();
         File dump = new File(filepath);
         newFile.renameTo(dump);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void deleteRecord(String filepath, String inputic) {
      String tempFile = "deletetemp.txt";
      File oldFile = new File(filepath);
      File newFile = new File(tempFile);
      String start = "";
      String end = "";
      String name = "";
      String ic = "";
      String contact = "";
      String email = "";

      try {
         FileWriter fw = new FileWriter(tempFile, true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);
         Scanner x = new Scanner(new File(filepath));

         while (x.hasNext()) {
            start = x.nextLine().trim();
            end = x.nextLine().trim();
            name = x.nextLine();
            ic = x.nextLine().trim();
            contact = x.nextLine().trim();
            email = x.nextLine().trim();

            if (!ic.equals(inputic)) {
               pw.println(start);
               pw.println(end);
               pw.println(name);
               pw.println(ic);
               pw.println(contact);
               pw.println(email);
            }
         }
         pw.flush();
         pw.close();
         x.close();
         bw.close();
         fw.close();
         oldFile.delete();
         File dump = new File(filepath);
         newFile.renameTo(dump);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   // Room check for own booking
   public boolean roomCheckSelf(String roomno, int end, String ic) {

      boolean found = false;
      try {
         File file = new File(roomno + ".txt");
         Scanner x = new Scanner(file);
         Scanner y = new Scanner(file);
         int tempStart = 0;
         int tempEnd = 0;
         String tempic = "";
         while (y.hasNext()) {// To get current start and end day of customer
            tempStart = Integer.valueOf(y.nextLine());
            tempEnd = Integer.valueOf(y.nextLine());
            y.nextLine();
            tempic = y.nextLine().trim();
            y.nextLine();
            y.nextLine();
            if (tempic.equals(ic)) {
               break;
            }
         }
         while (x.hasNext()) {// To check if dates overlap
            int newStart = Integer.valueOf(x.nextLine());
            int newEnd = Integer.valueOf(x.nextLine());
            x.nextLine();
            String newic = x.nextLine().trim();
            x.nextLine();
            x.nextLine();
            if (ic.equals(newic)) { //when obtained ic - special check to exclude own booking dates 
               if ((end == newEnd && end != tempEnd) || ((end > newStart && end <= newEnd) && end != tempEnd)) {
                  found = true;
               }
               if (end != newEnd || end == tempEnd || !(end > newStart && end <= newEnd)) {
                  found = false;
               }
            } else {
               if (start == newStart // start day equal to other starts
                       || end == newEnd // end day equal to other ends
                       || (start >= newStart && start < newEnd) // start day between other bookings
                       || (end > newStart && end <= newEnd) // end day between other bookings
                       ) {

                  found = true;
               }
            }
         }
         if (ic.equals(tempic) && (start == tempStart && end == tempEnd)) {
            found = false;
         }
         x.close();
         y.close();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(RoomBooking.class.getName()).log(Level.SEVERE, null, ex);
      }
      return found;
   }

}

class User {

   private String Username, Password;

   public User(String Username, String Password) {
      this.Username = Username;
      this.Password = Password;
   }

   public String getUsername() {
      return Username;
   }

   public void setUsername(String Username) {
      this.Username = Username;
   }

   public String getPassword() {
      return Password;
   }

   public void setPassword(String Password) {
      this.Password = Password;
   }

}

public class HotelBooking {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   }

}
