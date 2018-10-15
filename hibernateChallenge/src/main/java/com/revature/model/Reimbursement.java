package com.revature.model;

public class Reimbursement {
	private int id;
	private int amount;
	private String description;
	private byte[] recipt;
	private String submitted_ts;
	private String resolved_ts;
	private ErsUser id_author;
	private ErsUser id_resolver;
	private ReimbursementType type;
	private ReimbursementStatus status;

	public Reimbursement(int id, int amount, String description, byte[] recipt, String submitted_ts, String resolved_ts,
			ErsUser id_author, ErsUser id_resolver, ReimbursementType type, ReimbursementStatus status) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.recipt = recipt;
		this.submitted_ts = submitted_ts;
		this.resolved_ts = resolved_ts;
		this.id_author = id_author;
		this.id_resolver = id_resolver;
		this.type = type;
		this.status = status;
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

	public ErsUser getId_author() {
		return id_author;
	}

	public void setId_author(ErsUser id_author) {
		this.id_author = id_author;
	}

	public ErsUser getId_resolver() {
		return id_resolver;
	}

	public void setId_resolver(ErsUser id_resolver) {
		this.id_resolver = id_resolver;
	}

	public ReimbursementType getType() {
		return type;
	}

	public void setType(ReimbursementType type) {
		this.type = type;
	}

	public ReimbursementStatus getStatus() {
		return status;
	}

	public void setStatus(ReimbursementStatus status) {
		this.status = status;
	}

}
