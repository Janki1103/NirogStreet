package com.example.PageObjects;
import org.openqa.selenium.WebDriver;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.PropertyFileOperations;

import cucumber.app.enums.FileNames;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoctorMyProfileAddDetails extends GenericUtils {
    PropertyFileOperations locators;
    public WebDriver driver;
	
	public GenericUtils genericUtils;
    static Logger log = LogManager.getLogger(DoctorMyProfileAddDetails.class);
    
	
 {
    locators = new PropertyFileOperations(FileNames.NirogStreetLocator);
    log.info("STEP: Assets Page Locators loaded into memory");
}
public DoctorMyProfileAddDetails() throws IOException {

    // this.driver=getDriver();
   
}
    public  WebDriver getDriver() {
        return driverThread.get();
    }  

    public void clickOnProfileIcon(){
        clickOnElement(locators.getKey("Profileiconclick"));
    }

    public void clickOnChangeProfilePicture(){
        verifyVisibility(locators.getKey("ChangeProfilePicture"));
        JPGfileuploading(locators.getKey("ChangeProfilePicture"));
       
    }

    public void clickOnPersonalAndContactDetailsTab(){
     //   clickOnElement(locators.getKey("PersonalDetailTab_Close"));
      //  scrollDown150();
    }
    public void clickOnPersonalAndContactDetailsTabFORUpdateMob(){
        wait(3000);
        scrollDown150();
        wait(3000);
        clickOnElement(locators.getKey("PersonalDetailTab_Close"));
        wait(5000);
        scrollDown150();
    }
    public void selectTheDropdownAndSelectTheGender(String gender){
        wait(3000);
       scrollDown();
       wait(2000);
        selectDropDown(locators.getKey("Profile_gender"), gender);
       
    }

    public void clickCategoryAndSelectTheCategory(String category){
        wait(2000);
        selectDropDown(locators.getKey("Profile_Category"), category);
    }

    public void addTheExperience(String experience){
        wait(2000);
        enterText(locators.getKey("profile_experience"), experience);
    }

    public void addDateOfBirth(String date){
        scrollDown150();
        wait(3000);
        enterTextWithClick(locators.getKey("profile_DOB"), date);
    }

    public void addTheWebSite(String Website){
        wait(2000);
        enterText(locators.getKey("profile_website"), Website);
    }

    public void addTheAbout(String about){
        wait(2000);
        enterText(locators.getKey("profile_about"), about);
        scrollDown150();
    }

    public void clickOnMobileEditIcon(){
        scrollDown();
        scrollDown();
       // scrollDown250();
        wait(2000);
        clickOnElement(locators.getKey("MobileNumberEditClick"));

    }
    public void clickOnMobileEditIconAgain(){
        // scrollDown();
         scrollDown();
         wait(1000);
         scrollDown();
       // scrollDown250();
        wait(2000);
        clickOnElement(locators.getKey("MobileNumberEditClick"));

    }
    public void enterMobileAndClickOnGetOtpButton(String entermobile){
        wait(1000);
        enterText(locators.getKey("Enter_Mobile"), entermobile);
        wait(1000);
        clickOnElement(locators.getKey("Click_NextButton"));

    }
    public void clickOnProceedButton(String MobileNumberChangeSuccessfullMessage){
        wait(1000);
        clickOnElement(locators.getKey("MobileOTProceedButton"));
        // wait(2000);
        verifyVisibility(locators.getKey("MobileNUmberChangeSuccessfullMessage"));
        verifyText(locators.getKey("MobileNUmberChangeSuccessfullMessage"), MobileNumberChangeSuccessfullMessage);
        wait(5000);
    }

    
    public void clickOnSaveButton(String SuccessfullyMessage){
        
        wait(1000);
        scrollDown150();
        wait(1000);
        clickOnElement(locators.getKey("PersonalDetailTab_Save"));
        verifyText(locators.getKey("Personal_Detail_Sucessfully_Message"), SuccessfullyMessage);
    }

    public void clickOnEducationTab(){
        wait(3000);
        //scrollDown250();
       // clickOnElement(locators.getKey("EducationTab_Close"));
        // scrollDown250();
        // scrollUp150();
        // clickOnElement(locators.getKey("Education_AddmoreButton"));
    }
    public void clickOnQualificationAndSelectQualification(String qualification){
       scrollDown250();
        selectDropDown(locators.getKey("Education_Qualification"), qualification);
    }

    public void clickOnUniversityAndSelectUniversity(String university ){
        selectDropDown(locators.getKey("Education_university"), university);
    }
    public void addPassingYear(String passingyear){
        enterText(locators.getKey("Education_year"), passingyear);
    }

    public void addDocumentAndClickOnSaveButton(String EducationDetailSaveSuccessfullMessage){
        PNGfileuploading(locators.getKey("Education_Docupload"));
        // scrollDown150();
        scrollDown250();
        wait(3000);
        clickOnElement(locators.getKey("EducationTab_Save"));
        verifyText(locators.getKey("Education_Detail_Sucessfully_Message"), EducationDetailSaveSuccessfullMessage);
    }

    public void clickOnThreeDots(){
        clickOnElement(locators.getKey("EducationTab_Close"));
        wait(1000);
        scrollup();
        wait(1000);
        clickOnElement(locators.getKey("Education_clickthreedots"));
        wait(1000);
       // scrollDown150();
    }
    public void clickOnThreeDotsforDelete(){
       // clickOnElement(locators.getKey("EducationTab_Close"));
       // wait(1000);
      //  scrollup();
        wait(1000);
        clickOnElement(locators.getKey("Education_clickthreedots"));
        wait(1000);
       // scrollDown150();
    }
    public void clickOnEditEducation(){
       
        clickOnElement(locators.getKey("Education_clickEditEducation"));
        wait(1000);
    }

    public void updateQualification(String UpdateQualification){
        wait(5000);
        selectDropDown(locators.getKey("Education_Qualification"),UpdateQualification );
    }

    public void updateUniversity(String updateUniversity){
        selectDropDown(locators.getKey("Education_university"), updateUniversity);
    }

    public void updatePassingYear(String updatepassingYear){
        enterText(locators.getKey("Education_year"),updatepassingYear );
    }

    public void updateDocumentAndClickOnSaveButton(String EducationUpdateSuccessfullMessage){
        JPGfileuploading(locators.getKey("Education_Docupload"));
        scrollDown150();
        wait(2000);
        scrollDown150();
        wait(3000);
        clickOnElement(locators.getKey("EducationTab_Save"));
        verifyText(locators.getKey("Education_Detail_Sucessfully_Message"), EducationUpdateSuccessfullMessage);
        scrollup();
        wait(1000);
        // scrollup();
        // wait(1000);
    }

    public void deleteEducationDetails(String EducationDetailRemovedSuccessfullMessage){
        //scrollUp();
        //scrollDown150();
        // wait(1000);
        //scrollDown250();
        //wait(1000);    
        clickOnElement(locators.getKey("Education_deleteEducationDetails"));
        verifyText(locators.getKey("Education_Detail_Removed_Sucessfully_Message"), EducationDetailRemovedSuccessfullMessage);
    }

    public void openServicesTabAndClickOnAddMoreButton(){
        wait(3000);
        clickOnElement(locators.getKey("ServicesTab_Open"));
        wait(3000);
       // scrollDownTillElementFind(locators.getKey("Services_AddmoreButton"));
        // wait(1000);
     //   scrollDown250();
        wait(1000);
        clickOnElement(locators.getKey("Services_AddmoreButton"));
    }

    public void addServicesAndSaveButton(String services){
        EnterWithActionDownEnter(locators.getKey("service_Search"), services);
        wait(3000);
        clickOnElement(locators.getKey("Services_saveButton"));
        
    }

    public void saveServiceSuccessfullyMessage(String serviceSuccessfullMessage){
        verifyText(locators.getKey("Services_Sucessfully_Message"), serviceSuccessfullMessage);
        wait(5000);

    }

    public void deleteServicesAndGetTheRemovedServicesMessage(String RemoveServicesSuccessfulyMessage ){
       scrollUp150();
       scrollDown150();
       mouseOver(locators.getKey("Services_RemoveThick"));
        clickOnElement(locators.getKey("Services_RemoveThick"));
      //  wait(1000);
        verifyText(locators.getKey("Services_RemoveSuccessfullyMessage"), RemoveServicesSuccessfulyMessage);
          wait(4000);
    }

    public void clickOnSpecialisationTabAndClickAddmoreButton(){
        wait(3000);
        clickOnElement(locators.getKey("Specialisation_Open"));
        scrollDown150();
        scrollDown150();
        wait(4000);
        //scrollTillElementDisplay(locators.getKey("Specialisation_AddmoreButton"));
        clickOnElement(locators.getKey("Specialisation_AddmoreButton"));
    }

    public void addSpecializationAndSaveButton(String specialization ){
        wait(3000);
        EnterWithActionDownEnter(locators.getKey("Specialisation_Search"), specialization);
        wait(3000);
        clickOnElement(locators.getKey("SpecializationTab_Save"));
    }

    public void saveSpecializationSuccessfullyMessage(String specializationSuccessfullMessage){
        verifyText(locators.getKey("specializationTab_Sucessfully_Message"), specializationSuccessfullMessage);

    }

    public void deleteSpecialisationAndGetTheRemovedSpecialisationMessage(String removespecialisationsuccessfullmessage ){
        scrollUp150();
        wait(1000);
        mouseOver(locators.getKey("SpecializationTab_removethick"));
        clickOnElement(locators.getKey("SpecializationTab_removethick"));
        wait(1000);
        verifyText(locators.getKey("specializationTab_RemoveSuccessfullyMessage"), removespecialisationsuccessfullmessage);
    }

    

    public void clickOnExperianceTabAndClickAddmoreButton(){
        wait(3000);
        scrollDown250();
        wait(5000);
        clickOnElement(locators.getKey("ExperianceTab_Open"));
        wait(3000);
        clickOnElement(locators.getKey("Experiance_AddmoreButton"));
        wait(2000);
    }

    public void addCity(String city ){
        wait(3000);
        enterText(locators.getKey("Experiance_city"), city);
    }

    public void addHospitalOrClinicName(String hospitalorClinicName ){
        wait(3000);
        enterText(locators.getKey("Experinace_hospital"), hospitalorClinicName);
    }

    public void addFrom(String from ){
        wait(3000);
        selectDropDown(locators.getKey("Experiance_From"), from);
    }

    public void addToAndClickOnCheckBoxCurrentlyWorkingHere(String to ){
        wait(3000);
        selectDropDown(locators.getKey("Experiance_to"), to);
        clickOnElement(locators.getKey("Experiance_CheckBoxCurrentlyWorkingHere"));
        clickOnElement(locators.getKey("Experiance_CheckBoxCurrentlyWorkingHere"));
    }

    public void clickOnSaveButtonAndGetExperienceSuccessfullMessage(String experienceSuccessfullMessage){
        clickOnElement(locators.getKey("Experiance_Save"));
        verifyText(locators.getKey("Successfullmessage_experiance"), experienceSuccessfullMessage);
    }

    public void clickOnEducationThreeDots(){
        wait(1000);
        scrollup();
        wait(1000);
        clickOnElement(locators.getKey("Experiance_Threedot"));
    }


    public void clickOnEditExperienceDetail(){
        //scrollDown150();
       // scrollUp();
        wait(2000);
        clickOnElement(locators.getKey("Experiance_ClickOnEdit"));
    }

    public void updateTheCity(String updateCity){
        wait(3000);
        enterText(locators.getKey("Experiance_city"),updateCity );
    }

    public void updateHospitalOrClinicName(String updatehospitalorClinicName){
        wait(3000);
        enterText(locators.getKey("Experinace_hospital"), updatehospitalorClinicName);
    }

    public void updateFrom(String updatefrom){
        wait(3000);
        selectDropDown(locators.getKey("Experiance_From"), updatefrom);
    }
    public void updateTo(String updateto){
        wait(3000);
        selectDropDown(locators.getKey("Experiance_to"), updateto);
        clickOnElement(locators.getKey("Experiance_CheckBoxCurrentlyWorkingHere"));
    }

    public void  clickOnSaveButtonAndGetUpdateSuccessfullMessage(String UpdateexperienceSuccessfullMessage){
        clickOnElement(locators.getKey("Experiance_Save"));
        verifyText(locators.getKey("Successfullmessage_experiance"), UpdateexperienceSuccessfullMessage);
    }

    public void clickOnThreeDotsAndDeleteExperienece(){
      
        scrollUp();
       // scrollUp150();       
        wait(3000);
        clickOnElement(locators.getKey("Experiance_Threedot"));
        //scrollDown250();
        wait(3000);
        clickOnElement(locators.getKey("Experiance_deleteOption"));
        
    }

    public void gettingRemoveSuccessfullMesssage(String deleteexperiencemessage ){
        verifyText(locators.getKey("Experiance_RemoveMessage"), deleteexperiencemessage);

    }

    public void clickOnAwardTabAndClickOnAddButton(){
        wait(3000);
        scrollDown250();
        wait(3000);
        clickOnElement(locators.getKey("AwardTab_open"));
        wait(3000);
        clickOnElement(locators.getKey("Award_AddmoreButton"));
    }
    public void clickOnAwardTabAndClickOnAddButtonForStudent(){
        wait(3000);
        //scrollDown250();
        wait(3000);
        clickOnElement(locators.getKey("AwardTab_open"));
        wait(3000);
        clickOnElement(locators.getKey("Award_AddmoreButton"));
    }

    public void addTheAwardName(String Awardname){
        enterText(locators.getKey("Awardname"), Awardname);
    }

    public void selectTheYearAndSaveButton(String year){
        selectDropDown(locators.getKey("Award_year"), year);
        wait(1000);
        clickOnElement(locators.getKey("Award_Save"));
    }

    public void getTheAwardSuccessfullMessage(String AwardSuccessfullMessage){
        verifyText(locators.getKey("Createmessage_award"), AwardSuccessfullMessage);
    }

    public void deleteAwardDetails(String AwardRemovedSuccessfullMessage){
        scrollUp();
        wait(3000);
        clickOnElement(locators.getKey("Award_Threedot"));
        wait(5000);
        clickOnElement(locators.getKey("Awarddetail_delete"));
        verifyText(locators.getKey("Award_detail_deleteMessage"), AwardRemovedSuccessfullMessage);
    }

    public void clickOnMembershipsTabAndClickOnAddButton(){
        scrollDown150();
        wait(5000);
        clickOnElement(locators.getKey("MembershipTab_Open"));
        wait(5000);
        //scrollDown150();
        wait(3000);
        clickOnElement(locators.getKey("Membership_AddmoreButton"));
    }
   public void addTheMembershipAndClickOnSaveButton(String membership){
    enterText(locators.getKey("Membershipname"), membership);
    wait(1000);
    clickOnElement(locators.getKey("Membership_Save"));
   }

   public void getTheMembershipSuccessfullMessage(String MembershipSuccessfullMessage ){
    verifyText(locators.getKey("membershipSuccessfulmessage"), MembershipSuccessfullMessage);
   }

   public void deleteMemebershipdDetails(String MembershipRemovedSuccessfullMessage){
    wait(3000);
    clickOnElement(locators.getKey("Membership_Threedot"));
    //scrollDown250();
    wait(5000);
    clickOnElement(locators.getKey("Membershipdetails_delete"));
    verifyText(locators.getKey("membershipRemovedSuccessfulmessage"), MembershipRemovedSuccessfullMessage);
}

   public void clickOnClinicDetailsAndClickVidyaToolButton(){
    scrollDown250();
    scrollUp150();
    wait(1000);
    clickOnElement(locators.getKey("ClinicDetailsTab"));
    wait(1000);
    //scrollUp150();
    clickOnElement(locators.getKey("Clinic_VidyaTool"));
    wait(4000);
    navigateToBack();
    wait(4000);
   }

   public void clickOnUpdateProfessionButton(){
    scrollDown();
    scrollDown();
    scrollDown();
    wait(3000);
    clickOnElement(locators.getKey("Update_ProfessionButton"));
   }

   public void selectTheCouncilName(String councilname){
    selectDropDown(locators.getKey("Council_Name"), councilname);
   }

   public void writeTheMedicalRajistrationNumber(String rajistrationNumber){
    enterText(locators.getKey("Medical_RajistrationNumber"), rajistrationNumber);
   }

   public void writeTheYear(String passingyear){
    enterText(locators.getKey("Medical_PassingYear"), passingyear);
   }

   public void uploadTheMedicalRajistrationNumberDoc(){
    PNGfileuploading(locators.getKey("UploadMedical_RajistrationDocument/degree"));
   }
   public void clickOnSaveButton(){
    clickOnElement(locators.getKey("SaveButton_Sudent"));
   }
  



    

  

    










   



}
