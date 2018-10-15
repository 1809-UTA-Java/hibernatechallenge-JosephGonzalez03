package com.revature.model;

import java.awt.Image;
import java.util.Scanner;

public interface User {
	User login(User user);
	boolean viewHomePage();
	User logout();
	
	// employee user methods
	boolean submitReimbursementReq(Reimbursement rbmt);
	boolean uploadImage(Image img);
	boolean viewPendingReimbursementReqs();
	boolean viewResolvedReimbursementReqs();
	boolean viewInfo();
	boolean updateInfo(Scanner s);

	// manager user methods
	boolean reviewPendingReimbursementReqs();
	boolean viewImage(Reimbursement rmbmt);
	boolean viewAllPendingReimbursementReqs();
	boolean viewAllResolvedReimbursementReqs();
	boolean viewAllEmployees();
	boolean viewReimbursementReqs(User user);
}
