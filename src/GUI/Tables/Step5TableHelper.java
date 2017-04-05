/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Tables;

import core.Project;
import javafx.scene.Node;
import javafx.scene.control.TableView;

/**
 *
 * @author ltrask
 */
public class Step5TableHelper extends TableView {

    private static final int STEP_INDEX = 1;

    public static final int APP_WIZARD = 0;

    private static final String STEP2_TABLE_CSS = "step-one-table";

    public static Node createSysPlansNode(Project proj) {
        //return TableHelper.createQuestionYNTable(proj.getQGen().qSysPlansList, new TableHelper.Options(STEP2_TABLE_CSS));
        return TableHelper.createCommentPageYN(proj.getQGen().qSysPlansList);
    }

    public static Node createSchedulingNode(Project proj) {
        //return TableHelper.createQuestionYNTable(proj.getQGen().qSchedulingList, new TableHelper.Options(STEP2_TABLE_CSS));
        return TableHelper.createCommentPageYN(proj.getQGen().qSchedulingList);
    }

    public static Node createAcceptanceTrainingNode(Project proj) {
        //return TableHelper.createQuestionYNTable(proj.getQGen().qAcceptanceTrainingList, new TableHelper.Options(STEP2_TABLE_CSS));
        return TableHelper.createCommentPageYN(proj.getQGen().qAcceptanceTrainingList);
    }

    public static Node createDeploymentIssuesNode(Project proj) {
        //return TableHelper.createQuestionYNTable(proj.getQGen().qDeploymentIssuesList, new TableHelper.Options(STEP2_TABLE_CSS));
        return TableHelper.createCommentPageYN(proj.getQGen().qDeploymentIssuesList);
    }

}