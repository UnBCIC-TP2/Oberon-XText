/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.unb.grupo10.oberon.oberon.Arguments;
import org.unb.grupo10.oberon.oberon.Block;
import org.unb.grupo10.oberon.oberon.Constant;
import org.unb.grupo10.oberon.oberon.Declararion;
import org.unb.grupo10.oberon.oberon.Designator;
import org.unb.grupo10.oberon.oberon.Expression;
import org.unb.grupo10.oberon.oberon.FormalArg;
import org.unb.grupo10.oberon.oberon.Formals;
import org.unb.grupo10.oberon.oberon.Oberon;
import org.unb.grupo10.oberon.oberon.OberonPackage;
import org.unb.grupo10.oberon.oberon.OberonType;
import org.unb.grupo10.oberon.oberon.Operation;
import org.unb.grupo10.oberon.oberon.Procedure;
import org.unb.grupo10.oberon.oberon.Statement;
import org.unb.grupo10.oberon.oberon.UserTypeDeclaration;
import org.unb.grupo10.oberon.oberon.VarDeclaration;
import org.unb.grupo10.oberon.oberon.caseAlternative;
import org.unb.grupo10.oberon.oberon.elseIfStmt;
import org.unb.grupo10.oberon.services.OberonGrammarAccess;

@SuppressWarnings("all")
public class OberonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OberonGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OberonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OberonPackage.ARGUMENTS:
				sequence_Arguments(context, (Arguments) semanticObject); 
				return; 
			case OberonPackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case OberonPackage.BOOLEAN:
				sequence_OberonType(context, (org.unb.grupo10.oberon.oberon.Boolean) semanticObject); 
				return; 
			case OberonPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case OberonPackage.DECLARARION:
				sequence_Declarations(context, (Declararion) semanticObject); 
				return; 
			case OberonPackage.DESIGNATOR:
				if (rule == grammarAccess.getDesignatorRule()) {
					sequence_Designator(context, (Designator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTDesignatorRule()) {
					sequence_TDesignator(context, (Designator) semanticObject); 
					return; 
				}
				else break;
			case OberonPackage.EXPRESSION:
				if (rule == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTExpressionRule()) {
					sequence_TExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case OberonPackage.FORMAL_ARG:
				sequence_FormalArg(context, (FormalArg) semanticObject); 
				return; 
			case OberonPackage.FORMALS:
				sequence_Formals(context, (Formals) semanticObject); 
				return; 
			case OberonPackage.INTEGER:
				sequence_OberonType(context, (org.unb.grupo10.oberon.oberon.Integer) semanticObject); 
				return; 
			case OberonPackage.OBERON:
				sequence_Oberon(context, (Oberon) semanticObject); 
				return; 
			case OberonPackage.OBERON_TYPE:
				sequence_OberonType(context, (OberonType) semanticObject); 
				return; 
			case OberonPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case OberonPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case OberonPackage.STATEMENT:
				if (rule == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTStatementRule()) {
					sequence_TStatement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case OberonPackage.USER_TYPE_DECLARATION:
				sequence_UserTypeDeclaration(context, (UserTypeDeclaration) semanticObject); 
				return; 
			case OberonPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			case OberonPackage.CASE_ALTERNATIVE:
				sequence_caseAlternative(context, (caseAlternative) semanticObject); 
				return; 
			case OberonPackage.ELSE_IF_STMT:
				sequence_elseIfStmt(context, (elseIfStmt) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Arguments returns Arguments
	 *
	 * Constraint:
	 *     (exp=Expression exps+=Expression*)
	 */
	protected void sequence_Arguments(ISerializationContext context, Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Block returns Block
	 *
	 * Constraint:
	 *     stmt+=Statement*
	 */
	protected void sequence_Block(ISerializationContext context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     (constName=ID exp=Expression)
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OberonPackage.Literals.CONSTANT__CONST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OberonPackage.Literals.CONSTANT__CONST_NAME));
			if (transientValues.isValueTransient(semanticObject, OberonPackage.Literals.CONSTANT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OberonPackage.Literals.CONSTANT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantAccess().getConstNameIDTerminalRuleCall_0_0(), semanticObject.getConstName());
		feeder.accept(grammarAccess.getConstantAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declarations returns Declararion
	 *
	 * Constraint:
	 *     (types+=UserTypeDeclaration* consts+=Constant* vars+=VarDeclaration* proc+=Procedure*)
	 */
	protected void sequence_Declarations(ISerializationContext context, Declararion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Designator returns Designator
	 *
	 * Constraint:
	 *     (designator=TDesignator (indexes+=Expression | atribs+=ID)*)
	 */
	protected void sequence_Designator(ISerializationContext context, Designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (left=TExpression (opr+=Operation right+=Expression)*)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormalArg returns FormalArg
	 *
	 * Constraint:
	 *     (args+=ID args+=ID* argType=OberonType)
	 */
	protected void sequence_FormalArg(ISerializationContext context, FormalArg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Formals returns Formals
	 *
	 * Constraint:
	 *     (arg=FormalArg args+=FormalArg*)
	 */
	protected void sequence_Formals(ISerializationContext context, Formals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OberonType returns Boolean
	 *
	 * Constraint:
	 *     {Boolean}
	 */
	protected void sequence_OberonType(ISerializationContext context, org.unb.grupo10.oberon.oberon.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OberonType returns Integer
	 *
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_OberonType(ISerializationContext context, org.unb.grupo10.oberon.oberon.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OberonType returns OberonType
	 *
	 * Constraint:
	 *     (name=ID | (numElement=INT nameType=OberonType))
	 */
	protected void sequence_OberonType(ISerializationContext context, OberonType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Oberon returns Oberon
	 *
	 * Constraint:
	 *     (name=ID declaration=Declarations block=Block?)
	 */
	protected void sequence_Oberon(ISerializationContext context, Oberon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (
	 *         OperationRelacional='=' | 
	 *         OperationRelacional='#' | 
	 *         OperationRelacional='<' | 
	 *         OperationRelacional='<=' | 
	 *         OperationRelacional='>' | 
	 *         OperationRelacional='>=' | 
	 *         OperationAritmetic='*' | 
	 *         OperationAritmetic='/' | 
	 *         OperationAritmetic='+' | 
	 *         OperationAritmetic='-' | 
	 *         OperationLogic='&&' | 
	 *         OperationLogic='||'
	 *     )
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (name=ID formals=Formals? procedureType=OberonType? decl=Declarations block=Block)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (stmt=TStatement stmts+=Statement*)
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TDesignator returns Designator
	 *
	 * Constraint:
	 *     (name=ID args+=Arguments?)
	 */
	protected void sequence_TDesignator(ISerializationContext context, Designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TExpression returns Expression
	 *
	 * Constraint:
	 *     (exp=Expression | intvalue=IntValue | boolvalue=BoolValue | (name=ID args+=Arguments? atribs+=ID* index+=Expression*))
	 */
	protected void sequence_TExpression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TStatement returns Statement
	 *
	 * Constraint:
	 *     (
	 *         (des=Designator exp=Expression?) | 
	 *         var=ID | 
	 *         exp=Expression | 
	 *         (cond=Expression thenStmt=Statement elsifs+=elseIfStmt* elseStmt=Statement?) | 
	 *         (cond=Expression stmt=Statement) | 
	 *         (stmt=Statement cond=Expression) | 
	 *         (init=Statement condition=Expression stmt=Statement) | 
	 *         (var=ID min=Expression max=Expression stmt=Statement) | 
	 *         stmt=Statement | 
	 *         exp=Expression | 
	 *         (exp=Expression case=caseAlternative cases+=caseAlternative* elseStmt=Statement?) | 
	 *         exit='EXIT'
	 *     )
	 */
	protected void sequence_TStatement(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserTypeDeclaration returns UserTypeDeclaration
	 *
	 * Constraint:
	 *     ((nameType=ID length=INT vartype=OberonType) | (nameType=ID vars+=VarDeclaration+))
	 */
	protected void sequence_UserTypeDeclaration(ISerializationContext context, UserTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     (vars+=ID vars+=ID* varType=OberonType)
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     caseAlternative returns caseAlternative
	 *
	 * Constraint:
	 *     (exp=Expression max=Expression? stmt=Statement)
	 */
	protected void sequence_caseAlternative(ISerializationContext context, caseAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     elseIfStmt returns elseIfStmt
	 *
	 * Constraint:
	 *     (cond=Expression stmt=Statement)
	 */
	protected void sequence_elseIfStmt(ISerializationContext context, elseIfStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OberonPackage.Literals.ELSE_IF_STMT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OberonPackage.Literals.ELSE_IF_STMT__COND));
			if (transientValues.isValueTransient(semanticObject, OberonPackage.Literals.ELSE_IF_STMT__STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OberonPackage.Literals.ELSE_IF_STMT__STMT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElseIfStmtAccess().getCondExpressionParserRuleCall_0_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getElseIfStmtAccess().getStmtStatementParserRuleCall_2_0(), semanticObject.getStmt());
		feeder.finish();
	}
	
	
}
