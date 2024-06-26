package org.jrba.rulesengine.types.rulesteptype;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum with possible types of rule steps
 */
@Getter
@AllArgsConstructor
public enum RuleStepTypeEnum implements RuleStepType {

	// MESSAGE READER STEPS
	MESSAGE_READER_READ_STEP("MESSAGE_READER_READ_STEP"),
	MESSAGE_READER_READ_CONTENT_STEP("MESSAGE_READER_READ_CONTENT_STEP"),
	MESSAGE_READER_PROCESS_CONTENT_STEP("MESSAGE_READER_PROCESS_CONTENT_STEP"),

	// SINGLE MESSAGE READER STEPS
	SINGLE_MESSAGE_READER_CREATE_STEP("SINGLE_MESSAGE_READER_CREATE_STEP"),
	SINGLE_MESSAGE_READER_HANDLE_MESSAGE_STEP("SINGLE_MESSAGE_READER_HANDLE_MESSAGE_STEP"),

	// CFP STEPS
	CFP_CREATE_STEP("CFP_CREATE_STEP"),
	CFP_COMPARE_MESSAGES_STEP("CFP_COMPARE_MESSAGES_STEP"),
	CFP_HANDLE_REJECT_PROPOSAL_STEP("CFP_HANDLE_REJECT_PROPOSAL_STEP"),
	CFP_HANDLE_NO_RESPONSES_STEP("CFP_HANDLE_NO_RESPONSES_STEP"),
	CFP_HANDLE_NO_AVAILABLE_AGENTS_STEP("CFP_HANDLE_NO_AVAILABLE_AGENTS_STEP"),
	CFP_HANDLE_SELECTED_PROPOSAL_STEP("CFP_HANDLE_SELECTED_PROPOSAL_STEP"),

	// PROPOSAL STEPS
	PROPOSAL_CREATE_STEP("PROPOSAL_CREATE_STEP"),
	PROPOSAL_HANDLE_ACCEPT_STEP("PROPOSAL_HANDLE_ACCEPT_STEP"),
	PROPOSAL_HANDLE_REJECT_STEP("PROPOSAL_HANDLE_REJECT_STEP"),

	// REQUEST STEPS
	REQUEST_CREATE_STEP("REQUEST_CREATE_STEP"),
	REQUEST_HANDLE_INFORM_STEP("REQUEST_HANDLE_INFORM_STEP"),
	REQUEST_HANDLE_REFUSE_STEP("REQUEST_HANDLE_REFUSE_STEP"),
	REQUEST_HANDLE_FAILURE_STEP("REQUEST_HANDLE_FAILURE_STEP"),
	REQUEST_HANDLE_ALL_RESULTS_STEP("REQUEST_HANDLE_ALL_RESULTS_STEP"),

	// SEARCH STEPS
	SEARCH_AGENTS_STEP("SEARCH_AGENTS_STEP"),
	SEARCH_HANDLE_NO_RESULTS_STEP("SEARCH_HANDLE_NO_RESULTS_STEP"),
	SEARCH_HANDLE_RESULTS_STEP("SEARCH_HANDLE_RESULTS_STEP"),

	// SUBSCRIPTION STEPS
	SUBSCRIPTION_CREATE_STEP("SUBSCRIPTION_CREATE_STEP"),
	SUBSCRIPTION_HANDLE_AGENTS_RESPONSE_STEP("SUBSCRIPTION_HANDLE_AGENTS_RESPONSE_STEP"),

	// PERIODIC BEHAVIOUR STEPS
	PERIODIC_SELECT_PERIOD_STEP("PERIODIC_SELECT_PERIOD_STEP"),
	PERIODIC_EXECUTE_ACTION_STEP("PERIODIC_EXECUTE_ACTION_STEP"),

	// SCHEDULED BEHAVIOUR STEPS
	SCHEDULED_SELECT_TIME_STEP("SCHEDULED_SELECT_TIME_STEP"),
	SCHEDULED_EXECUTE_ACTION_STEP("SCHEDULED_EXECUTE_ACTION_STEP");

	final String type;
}
