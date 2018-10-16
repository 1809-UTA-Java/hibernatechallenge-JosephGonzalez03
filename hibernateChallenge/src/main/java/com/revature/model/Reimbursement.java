package com.revature.model;

public class Reimbursement {
	private int id;
	private int amount;
	private String description;
	private byte[] recipt;
	private String submitted_ts;
	private String resolved_ts;
	private ErsUser author;
	private ErsUser resolver;
	private ReimbursementType reimbursementType;
	private ReimbursementStatus reimbursementStatus;

	public Reimbursement(int id, int amount, String description, byte[] recipt, String submitted_ts, String resolved_ts,
			ErsUser author, ErsUser resolver, ReimbursementType reimbursementType,
			ReimbursementStatus reimbursementStatus) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.recipt = recipt;
		this.submitted_ts = submitted_ts;
		this.resolved_ts = resolved_ts;
		this.author = author;
		this.resolver = resolver;
		this.reimbursementType = reimbursementType;
		this.reimbursementStatus = reimbursementStatus;
	}

	public Reimbursement() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getReceipt() {
		return recipt;
	}

	public void setReceipt(byte[] recipt) {
		this.recipt = recipt;
	}

	public String getSubmitted_ts() {
		return submitted_ts;
	}

	public void setSubmitted_ts(String submitted_ts) {
		this.submitted_ts = submitted_ts;
	}

	public String getResolved_ts() {
		return resolved_ts;
	}

	public void setResolved_ts(String resolved_ts) {
		this.resolved_ts = resolved_ts;
	}

	public byte[] getRecipt() {
		return recipt;
	}

	public void setRecipt(byte[] recipt) {
		this.recipt = recipt;
	}

	public ErsUser getAuthor() {
		return author;
	}

	public void setAuthor(ErsUser author) {
		this.author = author;
	}

	public ErsUser getResolver() {
		return resolver;
	}

	public void setResolver(ErsUser resolver) {
		this.resolver = resolver;
	}

	public ReimbursementType getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(ReimbursementType reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

	public ReimbursementStatus getReimbursementStatus() {
		return reimbursementStatus;
	}

	public void setReimbursementStatus(ReimbursementStatus reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}

}
