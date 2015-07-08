/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.serializer;

import br.edu.sr.ifes.leds.ledsCodeV001.AccessModifier;
import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.Module;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;
import br.edu.sr.ifes.leds.services.LedsCodeV001GrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LedsCodeV001SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LedsCodeV001GrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LedsCodeV001Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LedsCodeV001Package.ACCESS_MODIFIER:
				sequence_AccessModifier(context, (AccessModifier) semanticObject); 
				return; 
			case LedsCodeV001Package.APPLICATION_BLOCK:
				sequence_ApplicationBlock(context, (ApplicationBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case LedsCodeV001Package.DATABASE:
				sequence_Database(context, (Database) semanticObject); 
				return; 
			case LedsCodeV001Package.DOMAIN_BLOCK:
				sequence_DomainBlock(context, (DomainBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.ENTITY_BLOCK:
				sequence_EntityBlock(context, (EntityBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.ENUM_BLOCK:
				sequence_EnumBlock(context, (EnumBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.EXTEND_BLOCK:
				sequence_ExtendBlock(context, (ExtendBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.INFRASTRUCTURE_BLOCK:
				sequence_InfrastructureBlock(context, (InfrastructureBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.INTERFACE_APPLICATION:
				sequence_InterfaceApplication(context, (InterfaceApplication) semanticObject); 
				return; 
			case LedsCodeV001Package.INTERFACE_BLOCK:
				sequence_InterfaceBlock(context, (InterfaceBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.LEDS_CODE_DSL:
				sequence_LedsCodeDSL(context, (LedsCodeDSL) semanticObject); 
				return; 
			case LedsCodeV001Package.METHOD_PARAMETER:
				sequence_MethodParameter(context, (MethodParameter) semanticObject); 
				return; 
			case LedsCodeV001Package.MODULE:
				sequence_Module(context, (Module) semanticObject); 
				return; 
			case LedsCodeV001Package.NAME_VERSION:
				sequence_NameVersion(context, (NameVersion) semanticObject); 
				return; 
			case LedsCodeV001Package.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case LedsCodeV001Package.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case LedsCodeV001Package.REPOSITORY_FIELDS:
				sequence_RepositoryFields(context, (RepositoryFields) semanticObject); 
				return; 
			case LedsCodeV001Package.SERVICE_BLOCK:
				sequence_ServiceBlock(context, (ServiceBlock) semanticObject); 
				return; 
			case LedsCodeV001Package.SERVICE_METHOD:
				sequence_ServiceMethod(context, (ServiceMethod) semanticObject); 
				return; 
			case LedsCodeV001Package.TYPE_AND_ATTRIBUTE:
				sequence_TypeAndAttribute(context, (TypeAndAttribute) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=Private | value=Protected)
	 */
	protected void sequence_AccessModifier(EObject context, AccessModifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID applicationDomain+=ImportCompoundName*)
	 */
	protected void sequence_ApplicationBlock(EObject context, ApplicationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (acessModifier=AccessModifier? type=DataType name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (versionValue=STRING nameValue=STRING userValue=STRING passValue=STRING hostValue=STRING)
	 */
	protected void sequence_Database(EObject context, Database semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.DATABASE__VERSION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.DATABASE__VERSION_VALUE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.DATABASE__NAME_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.DATABASE__NAME_VALUE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.DATABASE__USER_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.DATABASE__USER_VALUE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.DATABASE__PASS_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.DATABASE__PASS_VALUE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.DATABASE__HOST_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.DATABASE__HOST_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDatabaseAccess().getVersionValueSTRINGTerminalRuleCall_2_0(), semanticObject.getVersionValue());
		feeder.accept(grammarAccess.getDatabaseAccess().getNameValueSTRINGTerminalRuleCall_6_0(), semanticObject.getNameValue());
		feeder.accept(grammarAccess.getDatabaseAccess().getUserValueSTRINGTerminalRuleCall_10_0(), semanticObject.getUserValue());
		feeder.accept(grammarAccess.getDatabaseAccess().getPassValueSTRINGTerminalRuleCall_14_0(), semanticObject.getPassValue());
		feeder.accept(grammarAccess.getDatabaseAccess().getHostValueSTRINGTerminalRuleCall_18_0(), semanticObject.getHostValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID module+=Module*)
	 */
	protected void sequence_DomainBlock(EObject context, DomainBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         acessModifier=AccessModifier? 
	 *         isAbstract?='abstract'? 
	 *         name=ID 
	 *         superClasses=ExtendBlock? 
	 *         attributes+=Attribute* 
	 *         repository=Repository?
	 *     )
	 */
	protected void sequence_EntityBlock(EObject context, EntityBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID values+=ID values+=ID*)
	 */
	protected void sequence_EnumBlock(EObject context, EnumBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=CompoundName values+=CompoundName?)
	 */
	protected void sequence_ExtendBlock(EObject context, ExtendBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         basePackage=STRING 
	 *         projectVersion=STRING 
	 *         language=NameVersion 
	 *         framework=NameVersion 
	 *         orm=NameVersion 
	 *         database=Database
	 *     )
	 */
	protected void sequence_InfrastructureBlock(EObject context, InfrastructureBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__BASE_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__BASE_PACKAGE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__PROJECT_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__PROJECT_VERSION));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__FRAMEWORK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__FRAMEWORK));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__ORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__ORM));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__DATABASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK__DATABASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getBasePackageSTRINGTerminalRuleCall_4_0(), semanticObject.getBasePackage());
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getProjectVersionSTRINGTerminalRuleCall_7_0(), semanticObject.getProjectVersion());
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getLanguageNameVersionParserRuleCall_11_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getFrameworkNameVersionParserRuleCall_16_0(), semanticObject.getFramework());
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getOrmNameVersionParserRuleCall_21_0(), semanticObject.getOrm());
		feeder.accept(grammarAccess.getInfrastructureBlockAccess().getDatabaseDatabaseParserRuleCall_26_0(), semanticObject.getDatabase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type='HtmlView' | type='RestFull') name=ID nameApp=ID)
	 */
	protected void sequence_InterfaceApplication(EObject context, InterfaceApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interfaceApplication+=InterfaceApplication*)
	 */
	protected void sequence_InterfaceBlock(EObject context, InterfaceBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     project+=Project
	 */
	protected void sequence_LedsCodeDSL(EObject context, LedsCodeDSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeAndAttr+=TypeAndAttribute typeAndAttr+=TypeAndAttribute*)
	 */
	protected void sequence_MethodParameter(EObject context, MethodParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (serviceBlock+=ServiceBlock | entityBlock+=EntityBlock | enumBlock+=EnumBlock)*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nameValue=STRING versionValue=STRING)
	 */
	protected void sequence_NameVersion(EObject context, NameVersion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.NAME_VERSION__NAME_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.NAME_VERSION__NAME_VALUE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.NAME_VERSION__VERSION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.NAME_VERSION__VERSION_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameVersionAccess().getNameValueSTRINGTerminalRuleCall_2_0(), semanticObject.getNameValue());
		feeder.accept(grammarAccess.getNameVersionAccess().getVersionValueSTRINGTerminalRuleCall_6_0(), semanticObject.getVersionValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID infrastructureBlock=InfrastructureBlock interfaceBlock=InterfaceBlock? applicationBlock+=ApplicationBlock* domainBlock+=DomainBlock+)
	 */
	protected void sequence_Project(EObject context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nameMethod=ID methodsParameters=MethodParameter? returnType=DataType)
	 */
	protected void sequence_RepositoryFields(EObject context, RepositoryFields semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=RepositoryFields*)
	 */
	protected void sequence_Repository(EObject context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID serviceFields+=ServiceMethod*)
	 */
	protected void sequence_ServiceBlock(EObject context, ServiceBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methodAcess=CompoundName)
	 */
	protected void sequence_ServiceMethod(EObject context, ServiceMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.SERVICE_METHOD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.SERVICE_METHOD__NAME));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.SERVICE_METHOD__METHOD_ACESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.SERVICE_METHOD__METHOD_ACESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getServiceMethodAccess().getMethodAcessCompoundNameParserRuleCall_2_0(), semanticObject.getMethodAcess());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID)
	 */
	protected void sequence_TypeAndAttribute(EObject context, TypeAndAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.TYPE_AND_ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.TYPE_AND_ATTRIBUTE__TYPE));
			if(transientValues.isValueTransient(semanticObject, LedsCodeV001Package.Literals.TYPE_AND_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LedsCodeV001Package.Literals.TYPE_AND_ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAndAttributeAccess().getTypeDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypeAndAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
