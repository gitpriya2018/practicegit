package pageelements;

import org.openqa.selenium.By;

public interface Loginpage {
	
	By username_txt=By.name("uid");
	By password_txt=By.name("password");
	By login_btn=By.name("btnLogin");
	//Manager page elements
	By guru99bank_txt=By.className("barone");
	By manager_link=By.linkText("Manager");
	By newcustomer_link=By.linkText("New Customer");
	By editcustomer_link=By.linkText("Edit Customer");
	By deletecustomer_link=By.linkText("Delete Customer");
	By newaccount_link=By.linkText("New Account");
	By editaccount_link=By.linkText("Edit Account");
	By deleteaccount_link=By.linkText("Delete Account");
	By deposite_link=By.linkText("Deposit");
	By withdrawel_link=By.linkText("Withdrawal");
	By fundtransfer_link=By.linkText("Fund Transfer");
	By changepassword_link=By.linkText("Change Password");
	By balanceenquiry_link=By.linkText("Balance Enquiry");
	By ministatement_link=By.linkText("Mini Statement");
	By customstat_link=By.linkText("Customised Statement");
	By logout_link=By.linkText("Log out");
	//New customer link
	By custname_txt=By.name("name");
	By custnamevalidation_txt=By.id("message");
	By gendermale_rdbtn=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	By genderfemale_rdbtn=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
	By dob_txt=By.id("dob");
	By dobvalidation_txt=By.id("message2");
	By address_txtarea=By.name("addr");
	By addressvalidation_txt=By.id("message3");
	By city_txt=By.name("city");
	By cityvalidation_txt=By.id("message4");
	By state_txt=By.name("state");
	By statevalidation_txt=By.id("message5");
	By pin_txt=By.name("pinno");
	By pinvalidation_txt=By.id("message6");
	By ph_txt=By.name("telephoneno");
	By mobilevalidation_txt=By.id("message7");
	By email_txt=By.name("emailid");
	By emailvalidation_txt=By.id("message9");
	By newcustomerpassword_txt=By.name("password");
	By submit_btn=By.name("sub");
	By reset_btn=By.name("res");
	
}
