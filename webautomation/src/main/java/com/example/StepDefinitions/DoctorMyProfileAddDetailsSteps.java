package com.example.StepDefinitions;

import com.example.PageObjects.DoctorMyProfileAddDetails;
import com.example.PageObjects.PageObjectManager;
import com.example.Utilities.GenericUtils;
import com.example.Utilities.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoctorMyProfileAddDetailsSteps {
    //Initialized and declared driver out side of the method to accessible for entire 
//public WebDriver driver;


PageObjectManager pageObjectManager; 
// Call object of other classes
//TestContextSetup testContextSetup;
TestContextSetup testContextSetup  =  new TestContextSetup();
GenericUtils genericUtils;
//Spring Framework,EJB -Cucumber dependancy injection -Cucumber PicoContainer
//Create a new TestContextSetupClass file under Utility
// Will create one constructor with the same class name
// This constructor will automatically called when we create objects of this class
// Will pass instance of TestContextSetup
// Constructor
//=========


//public DoctorMyProfileAddDetailsSteps (TestContextSetup testContextSetup)
//{
//	this.testContextSetup= testContextSetup;
//}

public DoctorMyProfileAddDetailsSteps ()
{
	//this.testContextSetup= testContextSetup;
}

@When("^User click on profile icon$")
public void user_click_on_profile_icon() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnProfileIcon();
}

@When("^User Click on personal and contact details tab for update mobile number$")
    public void user_click_on_personal_and_contact_details_tab_for_update_mobile_number() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnPersonalAndContactDetailsTabFORUpdateMob();
    }

@When("^User click on change profile picture and upload the profile picture$")
public void user_click_on_change_profile_picture_and_upload_the_profile_picture() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnChangeProfilePicture();
}

@When("^User Click on personal and contact details tab$")
public void user_click_on_personal_and_contact_details_tab() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnPersonalAndContactDetailsTab();
    
}

@When("^User Select the dropdown and Select the gender(.+)$")
public void user_select_the_dropdown_and_select_the_gender(String gender) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.selectTheDropdownAndSelectTheGender(gender);
}

@When("^User click on category and select the category(.+)$")
public void user_click_on_category_and_select_the_category(String category) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickCategoryAndSelectTheCategory(category);
}

@When("^User able to add the experience(.+)$")
public void user_able_to_add_the_experience(String experience) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addTheExperience(experience);
}

@When("^user able to add the date as (.+)$")
public void user_able_to_add_the_date_as(String date) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addDateOfBirth(date);
}

@When("^User able to add the Website as (.+)$")
public void user_able_to_add_the_website_as(String website) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addTheWebSite(website);
}

@When("^User able to add the about as (.+)$")
public void user_able_to_add_the_about_as(String about) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addTheAbout(about);
}

@Given("^User click on mobile edit icon$")
public void user_click_on_mobile_edit_icon() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
   //doctorAddMyProfileAddDetails.scrollDown150();
    doctorAddMyProfileAddDetails.clickOnMobileEditIcon();
}
@Given("^User click on mobile edit icon again$")
    public void user_click_on_mobile_edit_icon_again() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
       // doctorAddMyProfileAddDetails.scrollUp150();
    doctorAddMyProfileAddDetails.clickOnMobileEditIconAgain();
    }
@Given("^User enter the mobile number as (.+) and click on get otp button$")
public void user_enter_the_mobile_number_as_and_click_on_get_otp_button(String entermobile) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.enterMobileAndClickOnGetOtpButton(entermobile);
}

@When("^User should be able to click on otp proceed button and get mobile number change successfull message as (.+)$")
public void user_should_be_able_to_click_on_otp_proceed_button_and_get_mobile_number_change_successfull_message_as(String mobilenumberchangesuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnProceedButton(mobilenumberchangesuccessfullmessage);
}

@When("^User able to click the save and (.+)$")
public void user_able_to_click_the_save_and(String successfullymessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnSaveButton(successfullymessage);
}

@When("^User click on Education tab and user click on add more button$")
public void user_click_on_education_tab_and_user_click_on_add_more_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnEducationTab();
}

@When("^user click on qualification and select the qualification as (.+)$")
public void user_click_on_qualification_and_select_the_qualification_as(String qualification) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnQualificationAndSelectQualification(qualification);
}

@When("^User click on university and select the university as (.+)$")
public void user_click_on_university_and_select_the_university_as(String university) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnUniversityAndSelectUniversity(university);
}

@When("^User add passing year as (.+)$")
public void user_add_passing_year_as(String passingyear) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addPassingYear(passingyear);
}
@When("^User able to upload the document and click on save button as (.+)$")
public void user_able_to_upload_the_document_and_click_on_save_button_as(String educationdetailsavesuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addDocumentAndClickOnSaveButton(educationdetailsavesuccessfullmessage);
}

@When("^User click on three dots$")
public void user_click_on_three_dots() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnThreeDots();
}
@When("^User click on three dots for delete$")
    public void user_click_on_three_dots_for_delete() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnThreeDotsforDelete();    }

@When("^User able to click on edit the education details$")
public void user_able_to_click_on_edit_the_education_details() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnEditEducation();
}

@When("^User able to update qualification as (.+)$")
public void user_able_to_update_qualification_as(String updatequalification) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.updateQualification(updatequalification);
}

@When("^User able to update university as (.+)$")
public void user_able_to_update_university_as(String updateuniversity) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.updateUniversity(updateuniversity);
}

@When("^User able to update passing year as (.+)$")
public void user_able_to_update_passing_year_as(String updatepassingyear) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.updatePassingYear(updatepassingyear);
}

@When("^User able to update upload document and click on save button get successfull message as (.+)$")
public void user_able_to_update_upload_document_and_click_on_save_button_get_successfull_message_as(String educationupdatesuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.updateDocumentAndClickOnSaveButton(educationupdatesuccessfullmessage);
}


@When("^User able to delete the education details as (.+)$")
public void user_able_to_delete_the_education_details_as(String EducationDetailRemovedSuccessfullMessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.deleteEducationDetails(EducationDetailRemovedSuccessfullMessage);
}


@When("^User click on services tab and User click on add more button$")
public void user_click_on_services_tab_and_user_click_on_add_more_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.openServicesTabAndClickOnAddMoreButton();
}

@When("^User click on search text field and select services and save the services as (.+)$")
public void user_click_on_search_text_field_and_select_services_and_save_the_services_as(String services) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addServicesAndSaveButton(services);
}

@When("^User save service SuccessfullyMessage(.+)$")
public void user_save_service_successfullymessage(String servicesuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.saveServiceSuccessfullyMessage(servicesuccessfullmessage);
}

@When("^User delete services and get the remove services successfully message as (.+)$")
public void user_delete_services_and_get_the_remove_services_successfully_message_as(String removeservicessuccessfulymessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.deleteServicesAndGetTheRemovedServicesMessage(removeservicessuccessfulymessage);
}

@When("^User click on specialization tab and click on add more button$")
public void user_click_on_specialization_tab_and_click_on_add_more_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnSpecialisationTabAndClickAddmoreButton();
}

@When("^User click on specialization tab and User click on add more button (.+)$")
public void user_click_on_specialization_tab_and_user_click_on_add_more_button(String specialization) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addSpecializationAndSaveButton(specialization);
}

@When("^User save specialization SuccessfullyMessage(.+)$")
public void user_save_specialization_successfullymessage(String specializationsuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.saveSpecializationSuccessfullyMessage(specializationsuccessfullmessage);
}

@When("^User remove the specialization and getting special remove message as (.+)$")
public void user_remove_the_specialization_and_getting_special_remove_message_as(String removespecialisationsuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.deleteSpecialisationAndGetTheRemovedSpecialisationMessage(removespecialisationsuccessfullmessage);
}

@When("^User click on experience tab and click on add more button$")
public void user_click_on_experience_tab_and_click_on_add_more_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnExperianceTabAndClickAddmoreButton();
}

@When("^User add the city as (.+)$")
public void user_add_the_city_as(String city) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addCity(city);
}

@When("^User add the Hospital or clinic name as (.+)$")
public void user_add_the_hospital_or_clinic_name_as(String hospitalorclinicname) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addHospitalOrClinicName(hospitalorclinicname);

}

@When("^User add from as (.+)$")
public void user_add_from_as(String from) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addFrom(from);
}
@When("^User add to as (.+) and click on check box currently working here$")
public void user_add_to_as_and_click_on_check_box_currently_working_here(String to) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addToAndClickOnCheckBoxCurrentlyWorkingHere(to);
}

@When("^User click on save button and get experience SuccessfullyMessage as (.+)$")
public void user_click_on_save_button_and_get_experience_successfullymessage_as(String experiencesuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnSaveButtonAndGetExperienceSuccessfullMessage(experiencesuccessfullmessage);
}

@When("^User click on Experience three dots$")
public void user_click_on_experience_three_dots() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnEducationThreeDots();
}
   
    @When("^User Click On edit experience detail$")
    public void user_click_on_edit_experience_detail() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnEditExperienceDetail();
    }

    @When("^User update the city as (.+)$")
    public void user_update_the_city_as(String updatecity) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.updateTheCity(updatecity);
    }

    @When("^User update the hospital or clinic name as (.+)$")
    public void user_update_the_hospital_or_clinic_name_as(String updatehospitalorclinicname) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.updateHospitalOrClinicName(updatehospitalorclinicname);
    }

    @When("^User update from as (.+)$")
    public void user_update_from_as(String updatefrom) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.updateFrom(updatefrom);
    }

    @When("^User update to as (.+)$")
    public void user_update_to_as(String updateto) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.updateTo(updateto);
    }

    @When("^User click on save button and get update experience SuccessfullyMessage as (.+)$")
    public void user_click_on_save_button_and_get_update_experience_successfullymessage_as(String updateexperiencesuccessfullmessage) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnSaveButtonAndGetUpdateSuccessfullMessage(updateexperiencesuccessfullmessage);
    }

@When("^User click on three dots and click on delete$")
    public void user_click_on_three_dots_and_click_on_delete() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnThreeDotsAndDeleteExperienece(); 
    }

@When("^User getting the delete experience message as (.+)$")
    public void user_getting_the_delete_experience_message_as(String deleteexperiencemessage) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.gettingRemoveSuccessfullMesssage(deleteexperiencemessage);
    }

@When("^User click on Awards tab and click on add button$")
    public void user_click_on_awards_tab_and_click_on_add_button() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnAwardTabAndClickOnAddButton();
    }
    @When("^User click on Awards tab and click on add button for student profile$")
    public void user_click_on_awards_tab_and_click_on_add_button_for_student_profile() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnAwardTabAndClickOnAddButtonForStudent();
    }
@When("^User add the Award name as (.+)$")
public void user_add_the_award_name_as(String awardname) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addTheAwardName(awardname);
}

@When("^User select the year as (.+) and click on save button$")
public void user_select_the_year_as_and_click_on_save_button(String year) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.selectTheYearAndSaveButton(year);
}

@When("^User get the award successfull message as (.+)$")
public void user_get_the_award_successfull_message_as(String awardsuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.getTheAwardSuccessfullMessage(awardsuccessfullmessage);
}

@When("^User get the award detail removed message as (.+)$")
    public void user_get_the_award_detail_removed_message_as(String awardremovedsuccessfullmessage) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.deleteAwardDetails(awardremovedsuccessfullmessage);
    }


@When("^User memberships tab and click on add button$")
public void user_memberships_tab_and_click_on_add_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnMembershipsTabAndClickOnAddButton();
}

@When("^User add the membership name as (.+) and click on save button$")
public void user_add_the_membership_name_as_and_click_on_save_button(String membership) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.addTheMembershipAndClickOnSaveButton(membership);
}

@When("^User get the membership successfull message(.+)$")
public void user_get_the_membership_successfull_message(String membershipsuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.getTheMembershipSuccessfullMessage(membershipsuccessfullmessage);
}

@When("^User delete the membersip details and get the msg membership removed as (.+)$")
public void user_delete_the_membersip_details_and_get_the_msg_membership_removed_as(String membershipremovedsuccessfullmessage) throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.deleteMemebershipdDetails(membershipremovedsuccessfullmessage);
}

@When("^User Click on clinic details tab and click on vidyatool button$")
public void user_click_on_clinic_details_tab_and_click_on_vidyatool_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.clickOnClinicDetailsAndClickVidyaToolButton();
}

@When("^User click on update profession button$")
public void user_click_on_update_profession_button() throws Throwable {
    DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnUpdateProfessionButton();
}



    @When("^User select the council name as (.+)$")
    public void user_select_the_council_name_as(String councilname) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.selectTheCouncilName(councilname);
    }

    @When("^User write the medical rajistration number (.+)$")
    public void user_write_the_medical_rajistration_number(String rajistrationnumber) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
    doctorAddMyProfileAddDetails.writeTheMedicalRajistrationNumber(rajistrationnumber);
    }

    @When("^User write the year (.+)$")
    public void user_write_the_year(String passingyear) throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.writeTheYear(passingyear);
    
    }

    @When("^User upload the medical rajistration number doc$")
    public void user_upload_the_medical_rajistration_number_doc() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.uploadTheMedicalRajistrationNumberDoc();
    }

    @Then("^User click on save button$")
    public void user_click_on_save_button() throws Throwable {
        DoctorMyProfileAddDetails doctorAddMyProfileAddDetails = testContextSetup.pageObjectManager.getDoctorMyProfileAddDetails();
        doctorAddMyProfileAddDetails.clickOnSaveButton();
    }







}
