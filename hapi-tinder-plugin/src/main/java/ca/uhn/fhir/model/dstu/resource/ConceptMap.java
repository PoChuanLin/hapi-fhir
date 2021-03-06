















package ca.uhn.fhir.model.dstu.resource;


import java.util.*;

import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.rest.gclient.*;
import ca.uhn.fhir.model.dstu.composite.AddressDt;
import ca.uhn.fhir.model.dstu.valueset.AdministrativeGenderCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.AdmitSourceEnum;
import ca.uhn.fhir.model.dstu.resource.AdverseReaction;
import ca.uhn.fhir.model.dstu.valueset.AggregationModeEnum;
import ca.uhn.fhir.model.dstu.valueset.AlertStatusEnum;
import ca.uhn.fhir.model.dstu.resource.AllergyIntolerance;
import ca.uhn.fhir.model.dstu.valueset.AnimalSpeciesEnum;
import ca.uhn.fhir.model.dstu.resource.Appointment;
import ca.uhn.fhir.model.dstu.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu.resource.Availability;
import ca.uhn.fhir.model.dstu.valueset.BindingConformanceEnum;
import ca.uhn.fhir.model.dstu.resource.CarePlan;
import ca.uhn.fhir.model.dstu.valueset.CarePlanActivityCategoryEnum;
import ca.uhn.fhir.model.dstu.valueset.CarePlanActivityStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.CarePlanGoalStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.CarePlanStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.CausalityExpectationEnum;
import ca.uhn.fhir.model.dstu.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu.composite.CodingDt;
import ca.uhn.fhir.model.dstu.valueset.CompositionAttestationModeEnum;
import ca.uhn.fhir.model.dstu.valueset.CompositionStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.ConceptMapEquivalenceEnum;
import ca.uhn.fhir.model.dstu.resource.Condition;
import ca.uhn.fhir.model.dstu.valueset.ConditionRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ConditionStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.ConformanceEventModeEnum;
import ca.uhn.fhir.model.dstu.valueset.ConformanceStatementStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.ConstraintSeverityEnum;
import ca.uhn.fhir.model.dstu.composite.ContactDt;
import ca.uhn.fhir.model.dstu.valueset.ContactUseEnum;
import ca.uhn.fhir.model.dstu.valueset.CriticalityEnum;
import ca.uhn.fhir.model.dstu.valueset.DataTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Device;
import ca.uhn.fhir.model.dstu.resource.DeviceObservationReport;
import ca.uhn.fhir.model.dstu.resource.DiagnosticOrder;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.dstu.resource.DiagnosticReport;
import ca.uhn.fhir.model.dstu.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.dstu.resource.DocumentManifest;
import ca.uhn.fhir.model.dstu.valueset.DocumentModeEnum;
import ca.uhn.fhir.model.dstu.resource.DocumentReference;
import ca.uhn.fhir.model.dstu.valueset.DocumentReferenceStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.DocumentRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Encounter;
import ca.uhn.fhir.model.dstu.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterReasonCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu.valueset.EncounterTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ExposureTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ExtensionContextEnum;
import ca.uhn.fhir.model.dstu.valueset.FHIRDefinedTypeEnum;
import ca.uhn.fhir.model.dstu.resource.FamilyHistory;
import ca.uhn.fhir.model.dstu.valueset.FilterOperatorEnum;
import ca.uhn.fhir.model.dstu.resource.GVFMeta;
import ca.uhn.fhir.model.dstu.resource.Group;
import ca.uhn.fhir.model.dstu.valueset.GroupTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.HierarchicalRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu.valueset.IdentifierUseEnum;
import ca.uhn.fhir.model.dstu.valueset.ImagingModalityEnum;
import ca.uhn.fhir.model.dstu.resource.ImagingStudy;
import ca.uhn.fhir.model.dstu.resource.Immunization;
import ca.uhn.fhir.model.dstu.valueset.ImmunizationReasonCodesEnum;
import ca.uhn.fhir.model.dstu.resource.ImmunizationRecommendation;
import ca.uhn.fhir.model.dstu.valueset.ImmunizationRecommendationDateCriterionCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.ImmunizationRecommendationStatusCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.ImmunizationRouteCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.InstanceAvailabilityEnum;
import ca.uhn.fhir.model.dstu.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.dstu.valueset.IssueTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.LinkTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ListModeEnum;
import ca.uhn.fhir.model.dstu.resource.Location;
import ca.uhn.fhir.model.dstu.valueset.LocationModeEnum;
import ca.uhn.fhir.model.dstu.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu.resource.Media;
import ca.uhn.fhir.model.dstu.valueset.MediaTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Medication;
import ca.uhn.fhir.model.dstu.resource.MedicationAdministration;
import ca.uhn.fhir.model.dstu.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.dstu.resource.MedicationDispense;
import ca.uhn.fhir.model.dstu.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.MedicationKindEnum;
import ca.uhn.fhir.model.dstu.resource.MedicationPrescription;
import ca.uhn.fhir.model.dstu.valueset.MedicationPrescriptionStatusEnum;
import ca.uhn.fhir.model.dstu.resource.MedicationStatement;
import ca.uhn.fhir.model.dstu.valueset.MessageEventEnum;
import ca.uhn.fhir.model.dstu.valueset.MessageSignificanceCategoryEnum;
import ca.uhn.fhir.model.dstu.valueset.MessageTransportEnum;
import ca.uhn.fhir.model.dstu.resource.Microarray;
import ca.uhn.fhir.model.dstu.valueset.ModalityEnum;
import ca.uhn.fhir.model.dstu.resource.Observation;
import ca.uhn.fhir.model.dstu.valueset.ObservationInterpretationCodesEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationReliabilityEnum;
import ca.uhn.fhir.model.dstu.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.dstu.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu.resource.Order;
import ca.uhn.fhir.model.dstu.valueset.OrderOutcomeStatusEnum;
import ca.uhn.fhir.model.dstu.resource.Organization;
import ca.uhn.fhir.model.dstu.valueset.OrganizationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ParticipantTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Patient;
import ca.uhn.fhir.model.dstu.valueset.PatientRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.composite.PeriodDt;
import ca.uhn.fhir.model.dstu.resource.Practitioner;
import ca.uhn.fhir.model.dstu.valueset.PractitionerRoleEnum;
import ca.uhn.fhir.model.dstu.valueset.PractitionerSpecialtyEnum;
import ca.uhn.fhir.model.dstu.resource.Procedure;
import ca.uhn.fhir.model.dstu.valueset.ProcedureRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu.resource.Profile;
import ca.uhn.fhir.model.dstu.valueset.PropertyRepresentationEnum;
import ca.uhn.fhir.model.dstu.valueset.ProvenanceEntityRoleEnum;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;
import ca.uhn.fhir.model.dstu.composite.QuantityDt;
import ca.uhn.fhir.model.dstu.valueset.QueryOutcomeEnum;
import ca.uhn.fhir.model.dstu.valueset.QuestionnaireGroupNameEnum;
import ca.uhn.fhir.model.dstu.valueset.QuestionnaireNameEnum;
import ca.uhn.fhir.model.dstu.valueset.QuestionnaireStatusEnum;
import ca.uhn.fhir.model.dstu.composite.RangeDt;
import ca.uhn.fhir.model.dstu.composite.RatioDt;
import ca.uhn.fhir.model.dstu.valueset.ReactionSeverityEnum;
import ca.uhn.fhir.model.dstu.resource.RelatedPerson;
import ca.uhn.fhir.model.dstu.valueset.ResourceProfileStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.ResourceTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.ResponseTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulConformanceModeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulOperationSystemEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulOperationTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulSecurityServiceEnum;
import ca.uhn.fhir.model.dstu.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu.composite.ScheduleDt;
import ca.uhn.fhir.model.dstu.valueset.SearchParamTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventActionEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventObjectLifecycleEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventObjectRoleEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventObjectSensitivityEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventObjectTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventOutcomeEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventParticipantNetworkTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SecurityEventSourceTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SensitivityStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.SensitivityTypeEnum;
import ca.uhn.fhir.model.dstu.resource.SequencingAnalysis;
import ca.uhn.fhir.model.dstu.resource.SequencingLab;
import ca.uhn.fhir.model.dstu.valueset.SlicingRulesEnum;
import ca.uhn.fhir.model.dstu.resource.Slot;
import ca.uhn.fhir.model.dstu.resource.Specimen;
import ca.uhn.fhir.model.dstu.valueset.SpecimenCollectionMethodEnum;
import ca.uhn.fhir.model.dstu.valueset.SpecimenTreatmentProcedureEnum;
import ca.uhn.fhir.model.dstu.resource.Substance;
import ca.uhn.fhir.model.dstu.valueset.SubstanceTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SupplyDispenseStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.SupplyItemTypeEnum;
import ca.uhn.fhir.model.dstu.valueset.SupplyStatusEnum;
import ca.uhn.fhir.model.dstu.valueset.SupplyTypeEnum;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;
import ca.uhn.fhir.model.dstu.resource.ValueSet;
import ca.uhn.fhir.model.dstu.valueset.ValueSetStatusEnum;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu.composite.AgeDt;
import ca.uhn.fhir.model.dstu.composite.DurationDt;
import ca.uhn.fhir.model.dstu.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu.resource.Binary;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.BoundCodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.IdrefDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.OidDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UriDt;


/**
 * HAPI/FHIR <b>ConceptMap</b> Resource
 * (A statement of relationships from one set of concepts to one or more other concept systems)
 *
 * <p>
 * <b>Definition:</b>
 * A statement of relationships from one set of concepts to one or more other concept systems
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ConceptMap">http://hl7.org/fhir/profiles/ConceptMap</a> 
 * </p>
 *
 */
@ResourceDef(name="ConceptMap", profile="http://hl7.org/fhir/profiles/ConceptMap", id="conceptmap")
public class ConceptMap 
    extends  BaseResource     implements IResource {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ConceptMap.identifier", description="The identifier of the concept map", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="ConceptMap.version", description="The version identifier of the concept map", type="token"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam VERSION = new TokenClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="ConceptMap.name", description="Name of the concept map", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="ConceptMap.publisher", description="Name of the publisher of the concept map", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="ConceptMap.description", description="Text search in the description of the concept map", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the concept map</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ConceptMap.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ConceptMap.status", description="Status of the concept map", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the concept map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The concept map publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ConceptMap.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ConceptMap.date", description="The concept map publication date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The concept map publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ConceptMap.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The system for any concepts mapped by this concept map</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ConceptMap.source</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="ConceptMap.source", description="The system for any concepts mapped by this concept map", type="reference"  )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The system for any concepts mapped by this concept map</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ConceptMap.source</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SOURCE = new ReferenceClientParam(SP_SOURCE);

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ConceptMap.source</b>".
	 */
	public static final Include INCLUDE_SOURCE = new Include("ConceptMap.source");

	/**
	 * Search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ConceptMap.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="target", path="ConceptMap.target", description="", type="reference"  )
	public static final String SP_TARGET = "target";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ConceptMap.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam TARGET = new ReferenceClientParam(SP_TARGET);

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ConceptMap.target</b>".
	 */
	public static final Include INCLUDE_TARGET = new Include("ConceptMap.target");

	/**
	 * Search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b>The system for any destination concepts mapped by this map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.map.system</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="system", path="ConceptMap.concept.map.system", description="The system for any destination concepts mapped by this map", type="token"  )
	public static final String SP_SYSTEM = "system";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b>The system for any destination concepts mapped by this map</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.map.system</b><br>
	 * </p>
	 */
	public static final TokenClientParam SYSTEM = new TokenClientParam(SP_SYSTEM);

	/**
	 * Search parameter constant for <b>dependson</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.dependsOn.concept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dependson", path="ConceptMap.concept.dependsOn.concept", description="", type="token"  )
	public static final String SP_DEPENDSON = "dependson";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dependson</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.dependsOn.concept</b><br>
	 * </p>
	 */
	public static final TokenClientParam DEPENDSON = new TokenClientParam(SP_DEPENDSON);

	/**
	 * Search parameter constant for <b>product</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.map.product.concept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="product", path="ConceptMap.concept.map.product.concept", description="", type="token"  )
	public static final String SP_PRODUCT = "product";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>product</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ConceptMap.concept.map.product.concept</b><br>
	 * </p>
	 */
	public static final TokenClientParam PRODUCT = new TokenClientParam(SP_PRODUCT);


	@Child(name="identifier", type=StringDt.class, order=0, min=0, max=1)	
	@Description(
		shortDefinition="Logical id to reference this concept map",
		formalDefinition="The identifier that is used to identify this concept map when it is referenced in a specification, model, design or an instance (should be globally unique OID, UUID, or URI)"
	)
	private StringDt myIdentifier;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Logical id for this version of the concept map",
		formalDefinition="The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=2, min=1, max=1)	
	@Description(
		shortDefinition="Informal name for this concept map",
		formalDefinition="A free text natural language name describing the concept map"
	)
	private StringDt myName;
	
	@Child(name="publisher", type=StringDt.class, order=3, min=0, max=1)	
	@Description(
		shortDefinition="Name of the publisher (Organization or individual)",
		formalDefinition="The name of the individual or organization that published the concept map"
	)
	private StringDt myPublisher;
	
	@Child(name="telecom", type=ContactDt.class, order=4, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Contact information of the publisher",
		formalDefinition="Contacts of the publisher to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<ContactDt> myTelecom;
	
	@Child(name="description", type=StringDt.class, order=5, min=0, max=1)	
	@Description(
		shortDefinition="Human language description of the concept map",
		formalDefinition="A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc."
	)
	private StringDt myDescription;
	
	@Child(name="copyright", type=StringDt.class, order=6, min=0, max=1)	
	@Description(
		shortDefinition="About the concept map or its content",
		formalDefinition="A copyright statement relating to the concept map and/or its contents"
	)
	private StringDt myCopyright;
	
	@Child(name="status", type=CodeDt.class, order=7, min=1, max=1)	
	@Description(
		shortDefinition="draft | active | retired",
		formalDefinition="The status of the concept map"
	)
	private BoundCodeDt<ValueSetStatusEnum> myStatus;
	
	@Child(name="experimental", type=BooleanDt.class, order=8, min=0, max=1)	
	@Description(
		shortDefinition="If for testing purposes, not real usage",
		formalDefinition="This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="date", type=DateTimeDt.class, order=9, min=0, max=1)	
	@Description(
		shortDefinition="Date for given status",
		formalDefinition="The date that the concept map status was last changed"
	)
	private DateTimeDt myDate;
	
	@Child(name="source", order=10, min=1, max=1, type={
		ca.uhn.fhir.model.dstu.resource.ValueSet.class	})
	@Description(
		shortDefinition="Identifies the source value set which is being mapped",
		formalDefinition="The source value set that specifies the concepts that are being mapped"
	)
	private ResourceReferenceDt mySource;
	
	@Child(name="target", order=11, min=1, max=1, type={
		ca.uhn.fhir.model.dstu.resource.ValueSet.class	})
	@Description(
		shortDefinition="Provides context to the mappings",
		formalDefinition="The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made"
	)
	private ResourceReferenceDt myTarget;
	
	@Child(name="concept", order=12, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Mappings for a concept from the source valueset",
		formalDefinition=""
	)
	private java.util.List<Concept> myConcept;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myVersion,  myName,  myPublisher,  myTelecom,  myDescription,  myCopyright,  myStatus,  myExperimental,  myDate,  mySource,  myTarget,  myConcept);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myVersion, myName, myPublisher, myTelecom, myDescription, myCopyright, myStatus, myExperimental, myDate, mySource, myTarget, myConcept);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (Logical id to reference this concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this concept map when it is referenced in a specification, model, design or an instance (should be globally unique OID, UUID, or URI)
     * </p> 
	 */
	public StringDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new StringDt();
		}
		return myIdentifier;
	}


	/**
	 * Gets the value(s) for <b>identifier</b> (Logical id to reference this concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this concept map when it is referenced in a specification, model, design or an instance (should be globally unique OID, UUID, or URI)
     * </p> 
	 */
	public StringDt getIdentifierElement() {  
		if (myIdentifier == null) {
			myIdentifier = new StringDt();
		}
		return myIdentifier;
	}


	/**
	 * Sets the value(s) for <b>identifier</b> (Logical id to reference this concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this concept map when it is referenced in a specification, model, design or an instance (should be globally unique OID, UUID, or URI)
     * </p> 
	 */
	public ConceptMap setIdentifier(StringDt theValue) {
		myIdentifier = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>identifier</b> (Logical id to reference this concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this concept map when it is referenced in a specification, model, design or an instance (should be globally unique OID, UUID, or URI)
     * </p> 
	 */
	public ConceptMap setIdentifier( String theString) {
		myIdentifier = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> (Logical id for this version of the concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public StringDt getVersion() {  
		if (myVersion == null) {
			myVersion = new StringDt();
		}
		return myVersion;
	}


	/**
	 * Gets the value(s) for <b>version</b> (Logical id for this version of the concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public StringDt getVersionElement() {  
		if (myVersion == null) {
			myVersion = new StringDt();
		}
		return myVersion;
	}


	/**
	 * Sets the value(s) for <b>version</b> (Logical id for this version of the concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public ConceptMap setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>version</b> (Logical id for this version of the concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the concept map when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public ConceptMap setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> (Informal name for this concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name describing the concept map
     * </p> 
	 */
	public StringDt getName() {  
		if (myName == null) {
			myName = new StringDt();
		}
		return myName;
	}


	/**
	 * Gets the value(s) for <b>name</b> (Informal name for this concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name describing the concept map
     * </p> 
	 */
	public StringDt getNameElement() {  
		if (myName == null) {
			myName = new StringDt();
		}
		return myName;
	}


	/**
	 * Sets the value(s) for <b>name</b> (Informal name for this concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name describing the concept map
     * </p> 
	 */
	public ConceptMap setName(StringDt theValue) {
		myName = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>name</b> (Informal name for this concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name describing the concept map
     * </p> 
	 */
	public ConceptMap setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>publisher</b> (Name of the publisher (Organization or individual)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the concept map
     * </p> 
	 */
	public StringDt getPublisher() {  
		if (myPublisher == null) {
			myPublisher = new StringDt();
		}
		return myPublisher;
	}


	/**
	 * Gets the value(s) for <b>publisher</b> (Name of the publisher (Organization or individual)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the concept map
     * </p> 
	 */
	public StringDt getPublisherElement() {  
		if (myPublisher == null) {
			myPublisher = new StringDt();
		}
		return myPublisher;
	}


	/**
	 * Sets the value(s) for <b>publisher</b> (Name of the publisher (Organization or individual))
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the concept map
     * </p> 
	 */
	public ConceptMap setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>publisher</b> (Name of the publisher (Organization or individual))
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the concept map
     * </p> 
	 */
	public ConceptMap setPublisher( String theString) {
		myPublisher = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>telecom</b> (Contact information of the publisher).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public java.util.List<ContactDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactDt>();
		}
		return myTelecom;
	}


	/**
	 * Gets the value(s) for <b>telecom</b> (Contact information of the publisher).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public java.util.List<ContactDt> getTelecomElement() {  
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactDt>();
		}
		return myTelecom;
	}


	/**
	 * Sets the value(s) for <b>telecom</b> (Contact information of the publisher)
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public ConceptMap setTelecom(java.util.List<ContactDt> theValue) {
		myTelecom = theValue;
		return this;
	}

	/**
	 * Adds and returns a new value for <b>telecom</b> (Contact information of the publisher)
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public ContactDt addTelecom() {
		ContactDt newType = new ContactDt();
		getTelecom().add(newType);
		return newType; 
	}

	/**
	 * Gets the first repetition for <b>telecom</b> (Contact information of the publisher),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public ContactDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
 	/**
	 * Adds a new value for <b>telecom</b> (Contact information of the publisher)
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public ConceptMap addTelecom( ContactUseEnum theContactUse,  String theValue) {
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactDt>();
		}
		myTelecom.add(new ContactDt(theContactUse, theValue));
		return this; 
	}

	/**
	 * Adds a new value for <b>telecom</b> (Contact information of the publisher)
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts of the publisher to assist a user in finding and communicating with the publisher
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public ConceptMap addTelecom( String theValue) {
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactDt>();
		}
		myTelecom.add(new ContactDt(theValue));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> (Human language description of the concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     * </p> 
	 */
	public StringDt getDescription() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}


	/**
	 * Gets the value(s) for <b>description</b> (Human language description of the concept map).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     * </p> 
	 */
	public StringDt getDescriptionElement() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}


	/**
	 * Sets the value(s) for <b>description</b> (Human language description of the concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     * </p> 
	 */
	public ConceptMap setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>description</b> (Human language description of the concept map)
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the concept map - reason for definition, conditions of use, etc.
     * </p> 
	 */
	public ConceptMap setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>copyright</b> (About the concept map or its content).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the concept map and/or its contents
     * </p> 
	 */
	public StringDt getCopyright() {  
		if (myCopyright == null) {
			myCopyright = new StringDt();
		}
		return myCopyright;
	}


	/**
	 * Gets the value(s) for <b>copyright</b> (About the concept map or its content).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the concept map and/or its contents
     * </p> 
	 */
	public StringDt getCopyrightElement() {  
		if (myCopyright == null) {
			myCopyright = new StringDt();
		}
		return myCopyright;
	}


	/**
	 * Sets the value(s) for <b>copyright</b> (About the concept map or its content)
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the concept map and/or its contents
     * </p> 
	 */
	public ConceptMap setCopyright(StringDt theValue) {
		myCopyright = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>copyright</b> (About the concept map or its content)
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the concept map and/or its contents
     * </p> 
	 */
	public ConceptMap setCopyright( String theString) {
		myCopyright = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (draft | active | retired).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the concept map
     * </p> 
	 */
	public BoundCodeDt<ValueSetStatusEnum> getStatus() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ValueSetStatusEnum>(ValueSetStatusEnum.VALUESET_BINDER);
		}
		return myStatus;
	}


	/**
	 * Gets the value(s) for <b>status</b> (draft | active | retired).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the concept map
     * </p> 
	 */
	public BoundCodeDt<ValueSetStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ValueSetStatusEnum>(ValueSetStatusEnum.VALUESET_BINDER);
		}
		return myStatus;
	}


	/**
	 * Sets the value(s) for <b>status</b> (draft | active | retired)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the concept map
     * </p> 
	 */
	public ConceptMap setStatus(BoundCodeDt<ValueSetStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}

	/**
	 * Sets the value(s) for <b>status</b> (draft | active | retired)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the concept map
     * </p> 
	 */
	public ConceptMap setStatus(ValueSetStatusEnum theValue) {
		getStatus().setValueAsEnum(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>experimental</b> (If for testing purposes, not real usage).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public BooleanDt getExperimental() {  
		if (myExperimental == null) {
			myExperimental = new BooleanDt();
		}
		return myExperimental;
	}


	/**
	 * Gets the value(s) for <b>experimental</b> (If for testing purposes, not real usage).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public BooleanDt getExperimentalElement() {  
		if (myExperimental == null) {
			myExperimental = new BooleanDt();
		}
		return myExperimental;
	}


	/**
	 * Sets the value(s) for <b>experimental</b> (If for testing purposes, not real usage)
	 *
     * <p>
     * <b>Definition:</b>
     * This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ConceptMap setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>experimental</b> (If for testing purposes, not real usage)
	 *
     * <p>
     * <b>Definition:</b>
     * This ConceptMap was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ConceptMap setExperimental( boolean theBoolean) {
		myExperimental = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>date</b> (Date for given status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the concept map status was last changed
     * </p> 
	 */
	public DateTimeDt getDate() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}


	/**
	 * Gets the value(s) for <b>date</b> (Date for given status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the concept map status was last changed
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}


	/**
	 * Sets the value(s) for <b>date</b> (Date for given status)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the concept map status was last changed
     * </p> 
	 */
	public ConceptMap setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>date</b> (Date for given status)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the concept map status was last changed
     * </p> 
	 */
	public ConceptMap setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (Date for given status)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the concept map status was last changed
     * </p> 
	 */
	public ConceptMap setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>source</b> (Identifies the source value set which is being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source value set that specifies the concepts that are being mapped
     * </p> 
	 */
	public ResourceReferenceDt getSource() {  
		if (mySource == null) {
			mySource = new ResourceReferenceDt();
		}
		return mySource;
	}


	/**
	 * Gets the value(s) for <b>source</b> (Identifies the source value set which is being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source value set that specifies the concepts that are being mapped
     * </p> 
	 */
	public ResourceReferenceDt getSourceElement() {  
		if (mySource == null) {
			mySource = new ResourceReferenceDt();
		}
		return mySource;
	}


	/**
	 * Sets the value(s) for <b>source</b> (Identifies the source value set which is being mapped)
	 *
     * <p>
     * <b>Definition:</b>
     * The source value set that specifies the concepts that are being mapped
     * </p> 
	 */
	public ConceptMap setSource(ResourceReferenceDt theValue) {
		mySource = theValue;
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>target</b> (Provides context to the mappings).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made
     * </p> 
	 */
	public ResourceReferenceDt getTarget() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}


	/**
	 * Gets the value(s) for <b>target</b> (Provides context to the mappings).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made
     * </p> 
	 */
	public ResourceReferenceDt getTargetElement() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}


	/**
	 * Sets the value(s) for <b>target</b> (Provides context to the mappings)
	 *
     * <p>
     * <b>Definition:</b>
     * The target value set provides context to the mappings. Note that the mapping is made between concepts, not between value sets, but the value set provides important context about how the concept mapping choices are made
     * </p> 
	 */
	public ConceptMap setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>concept</b> (Mappings for a concept from the source valueset).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<Concept> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<Concept>();
		}
		return myConcept;
	}


	/**
	 * Gets the value(s) for <b>concept</b> (Mappings for a concept from the source valueset).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<Concept> getConceptElement() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<Concept>();
		}
		return myConcept;
	}


	/**
	 * Sets the value(s) for <b>concept</b> (Mappings for a concept from the source valueset)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap setConcept(java.util.List<Concept> theValue) {
		myConcept = theValue;
		return this;
	}

	/**
	 * Adds and returns a new value for <b>concept</b> (Mappings for a concept from the source valueset)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept addConcept() {
		Concept newType = new Concept();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Gets the first repetition for <b>concept</b> (Mappings for a concept from the source valueset),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  
	/**
	 * Block class for child element: <b>ConceptMap.concept</b> (Mappings for a concept from the source valueset)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class Concept 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="system", type=UriDt.class, order=0, min=1, max=1)	
	@Description(
		shortDefinition="System that defines the concept being mapped",
		formalDefinition=""
	)
	private UriDt mySystem;
	
	@Child(name="code", type=CodeDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Identifies concept being mapped",
		formalDefinition=""
	)
	private CodeDt myCode;
	
	@Child(name="dependsOn", order=2, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Other concepts required for this mapping (from context)",
		formalDefinition="A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value"
	)
	private java.util.List<ConceptDependsOn> myDependsOn;
	
	@Child(name="map", order=3, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="A concept from the target value set that this concept maps to",
		formalDefinition=""
	)
	private java.util.List<ConceptMap2> myMap;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myCode,  myDependsOn,  myMap);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myCode, myDependsOn, myMap);
	}

	/**
	 * Gets the value(s) for <b>system</b> (System that defines the concept being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystem() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Gets the value(s) for <b>system</b> (System that defines the concept being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Sets the value(s) for <b>system</b> (System that defines the concept being mapped)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>system</b> (System that defines the concept being mapped)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> (Identifies concept being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCode() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Gets the value(s) for <b>code</b> (Identifies concept being mapped).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCodeElement() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Sets the value(s) for <b>code</b> (Identifies concept being mapped)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>code</b> (Identifies concept being mapped)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>dependsOn</b> (Other concepts required for this mapping (from context)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	public java.util.List<ConceptDependsOn> getDependsOn() {  
		if (myDependsOn == null) {
			myDependsOn = new java.util.ArrayList<ConceptDependsOn>();
		}
		return myDependsOn;
	}


	/**
	 * Gets the value(s) for <b>dependsOn</b> (Other concepts required for this mapping (from context)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	public java.util.List<ConceptDependsOn> getDependsOnElement() {  
		if (myDependsOn == null) {
			myDependsOn = new java.util.ArrayList<ConceptDependsOn>();
		}
		return myDependsOn;
	}


	/**
	 * Sets the value(s) for <b>dependsOn</b> (Other concepts required for this mapping (from context))
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	public Concept setDependsOn(java.util.List<ConceptDependsOn> theValue) {
		myDependsOn = theValue;
		return this;
	}

	/**
	 * Adds and returns a new value for <b>dependsOn</b> (Other concepts required for this mapping (from context))
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	public ConceptDependsOn addDependsOn() {
		ConceptDependsOn newType = new ConceptDependsOn();
		getDependsOn().add(newType);
		return newType; 
	}

	/**
	 * Gets the first repetition for <b>dependsOn</b> (Other concepts required for this mapping (from context)),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	public ConceptDependsOn getDependsOnFirstRep() {
		if (getDependsOn().isEmpty()) {
			return addDependsOn();
		}
		return getDependsOn().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>map</b> (A concept from the target value set that this concept maps to).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ConceptMap2> getMap() {  
		if (myMap == null) {
			myMap = new java.util.ArrayList<ConceptMap2>();
		}
		return myMap;
	}


	/**
	 * Gets the value(s) for <b>map</b> (A concept from the target value set that this concept maps to).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ConceptMap2> getMapElement() {  
		if (myMap == null) {
			myMap = new java.util.ArrayList<ConceptMap2>();
		}
		return myMap;
	}


	/**
	 * Sets the value(s) for <b>map</b> (A concept from the target value set that this concept maps to)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Concept setMap(java.util.List<ConceptMap2> theValue) {
		myMap = theValue;
		return this;
	}

	/**
	 * Adds and returns a new value for <b>map</b> (A concept from the target value set that this concept maps to)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 addMap() {
		ConceptMap2 newType = new ConceptMap2();
		getMap().add(newType);
		return newType; 
	}

	/**
	 * Gets the first repetition for <b>map</b> (A concept from the target value set that this concept maps to),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 getMapFirstRep() {
		if (getMap().isEmpty()) {
			return addMap();
		}
		return getMap().get(0); 
	}
  

	}

	/**
	 * Block class for child element: <b>ConceptMap.concept.dependsOn</b> (Other concepts required for this mapping (from context))
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified concept can be resolved, and it has the specified value
     * </p> 
	 */
	@Block()	
	public static class ConceptDependsOn 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="concept", type=UriDt.class, order=0, min=1, max=1)	
	@Description(
		shortDefinition="Reference to element/field/valueset provides the context",
		formalDefinition="A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition"
	)
	private UriDt myConcept;
	
	@Child(name="system", type=UriDt.class, order=1, min=1, max=1)	
	@Description(
		shortDefinition="System for a concept in the referenced concept",
		formalDefinition=""
	)
	private UriDt mySystem;
	
	@Child(name="code", type=CodeDt.class, order=2, min=1, max=1)	
	@Description(
		shortDefinition="Code for a concept in the referenced concept",
		formalDefinition=""
	)
	private CodeDt myCode;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myConcept,  mySystem,  myCode);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myConcept, mySystem, myCode);
	}

	/**
	 * Gets the value(s) for <b>concept</b> (Reference to element/field/valueset provides the context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition
     * </p> 
	 */
	public UriDt getConcept() {  
		if (myConcept == null) {
			myConcept = new UriDt();
		}
		return myConcept;
	}


	/**
	 * Gets the value(s) for <b>concept</b> (Reference to element/field/valueset provides the context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition
     * </p> 
	 */
	public UriDt getConceptElement() {  
		if (myConcept == null) {
			myConcept = new UriDt();
		}
		return myConcept;
	}


	/**
	 * Sets the value(s) for <b>concept</b> (Reference to element/field/valueset provides the context)
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition
     * </p> 
	 */
	public ConceptDependsOn setConcept(UriDt theValue) {
		myConcept = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>concept</b> (Reference to element/field/valueset provides the context)
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition
     * </p> 
	 */
	public ConceptDependsOn setConcept( String theUri) {
		myConcept = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>system</b> (System for a concept in the referenced concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystem() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Gets the value(s) for <b>system</b> (System for a concept in the referenced concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Sets the value(s) for <b>system</b> (System for a concept in the referenced concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptDependsOn setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>system</b> (System for a concept in the referenced concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptDependsOn setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> (Code for a concept in the referenced concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCode() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Gets the value(s) for <b>code</b> (Code for a concept in the referenced concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCodeElement() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Sets the value(s) for <b>code</b> (Code for a concept in the referenced concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptDependsOn setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>code</b> (Code for a concept in the referenced concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptDependsOn setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 

	}


	/**
	 * Block class for child element: <b>ConceptMap.concept.map</b> (A concept from the target value set that this concept maps to)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class ConceptMap2 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="system", type=UriDt.class, order=0, min=0, max=1)	
	@Description(
		shortDefinition="System of the target",
		formalDefinition=""
	)
	private UriDt mySystem;
	
	@Child(name="code", type=CodeDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Code that identifies the target concept",
		formalDefinition=""
	)
	private CodeDt myCode;
	
	@Child(name="equivalence", type=CodeDt.class, order=2, min=1, max=1)	
	@Description(
		shortDefinition="equal | equivalent | wider | subsumes | narrower | specialises | inexact | unmatched | disjoint",
		formalDefinition=""
	)
	private BoundCodeDt<ConceptMapEquivalenceEnum> myEquivalence;
	
	@Child(name="comments", type=StringDt.class, order=3, min=0, max=1)	
	@Description(
		shortDefinition="Description of status/issues in mapping",
		formalDefinition=""
	)
	private StringDt myComments;
	
	@Child(name="product", type=ConceptDependsOn.class, order=4, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Other concepts that this mapping also produces",
		formalDefinition="A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on"
	)
	private java.util.List<ConceptDependsOn> myProduct;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myCode,  myEquivalence,  myComments,  myProduct);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myCode, myEquivalence, myComments, myProduct);
	}

	/**
	 * Gets the value(s) for <b>system</b> (System of the target).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystem() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Gets the value(s) for <b>system</b> (System of the target).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
		}
		return mySystem;
	}


	/**
	 * Sets the value(s) for <b>system</b> (System of the target)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>system</b> (System of the target)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> (Code that identifies the target concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCode() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Gets the value(s) for <b>code</b> (Code that identifies the target concept).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeDt getCodeElement() {  
		if (myCode == null) {
			myCode = new CodeDt();
		}
		return myCode;
	}


	/**
	 * Sets the value(s) for <b>code</b> (Code that identifies the target concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>code</b> (Code that identifies the target concept)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>equivalence</b> (equal | equivalent | wider | subsumes | narrower | specialises | inexact | unmatched | disjoint).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeDt<ConceptMapEquivalenceEnum> getEquivalence() {  
		if (myEquivalence == null) {
			myEquivalence = new BoundCodeDt<ConceptMapEquivalenceEnum>(ConceptMapEquivalenceEnum.VALUESET_BINDER);
		}
		return myEquivalence;
	}


	/**
	 * Gets the value(s) for <b>equivalence</b> (equal | equivalent | wider | subsumes | narrower | specialises | inexact | unmatched | disjoint).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeDt<ConceptMapEquivalenceEnum> getEquivalenceElement() {  
		if (myEquivalence == null) {
			myEquivalence = new BoundCodeDt<ConceptMapEquivalenceEnum>(ConceptMapEquivalenceEnum.VALUESET_BINDER);
		}
		return myEquivalence;
	}


	/**
	 * Sets the value(s) for <b>equivalence</b> (equal | equivalent | wider | subsumes | narrower | specialises | inexact | unmatched | disjoint)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setEquivalence(BoundCodeDt<ConceptMapEquivalenceEnum> theValue) {
		myEquivalence = theValue;
		return this;
	}

	/**
	 * Sets the value(s) for <b>equivalence</b> (equal | equivalent | wider | subsumes | narrower | specialises | inexact | unmatched | disjoint)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setEquivalence(ConceptMapEquivalenceEnum theValue) {
		getEquivalence().setValueAsEnum(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>comments</b> (Description of status/issues in mapping).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getComments() {  
		if (myComments == null) {
			myComments = new StringDt();
		}
		return myComments;
	}


	/**
	 * Gets the value(s) for <b>comments</b> (Description of status/issues in mapping).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getCommentsElement() {  
		if (myComments == null) {
			myComments = new StringDt();
		}
		return myComments;
	}


	/**
	 * Sets the value(s) for <b>comments</b> (Description of status/issues in mapping)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setComments(StringDt theValue) {
		myComments = theValue;
		return this;
	}

 	/**
	 * Sets the value for <b>comments</b> (Description of status/issues in mapping)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ConceptMap2 setComments( String theString) {
		myComments = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>product</b> (Other concepts that this mapping also produces).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on
     * </p> 
	 */
	public java.util.List<ConceptDependsOn> getProduct() {  
		if (myProduct == null) {
			myProduct = new java.util.ArrayList<ConceptDependsOn>();
		}
		return myProduct;
	}


	/**
	 * Gets the value(s) for <b>product</b> (Other concepts that this mapping also produces).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on
     * </p> 
	 */
	public java.util.List<ConceptDependsOn> getProductElement() {  
		if (myProduct == null) {
			myProduct = new java.util.ArrayList<ConceptDependsOn>();
		}
		return myProduct;
	}


	/**
	 * Sets the value(s) for <b>product</b> (Other concepts that this mapping also produces)
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on
     * </p> 
	 */
	public ConceptMap2 setProduct(java.util.List<ConceptDependsOn> theValue) {
		myProduct = theValue;
		return this;
	}

	/**
	 * Adds and returns a new value for <b>product</b> (Other concepts that this mapping also produces)
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on
     * </p> 
	 */
	public ConceptDependsOn addProduct() {
		ConceptDependsOn newType = new ConceptDependsOn();
		getProduct().add(newType);
		return newType; 
	}

	/**
	 * Gets the first repetition for <b>product</b> (Other concepts that this mapping also produces),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of additional outcomes from this mapping to other value sets. To properly execute this mapping, the specified value set must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on
     * </p> 
	 */
	public ConceptDependsOn getProductFirstRep() {
		if (getProduct().isEmpty()) {
			return addProduct();
		}
		return getProduct().get(0); 
	}
  

	}





    @Override
    public String getResourceName() {
        return "ConceptMap";
    }

    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU1;
    }

}
