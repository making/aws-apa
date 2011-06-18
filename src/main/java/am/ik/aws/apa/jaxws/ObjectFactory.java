/*
 * Copyright (C) 2011 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package am.ik.aws.apa.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the am.ik.aws.apa.jaxws package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Condition_QNAME = new QName(
            "http://webservices.amazon.com/AWSECommerceService/2011-04-01",
            "Condition");
    private final static QName _DeliveryMethod_QNAME = new QName(
            "http://webservices.amazon.com/AWSECommerceService/2011-04-01",
            "DeliveryMethod");
    private final static QName _AudienceRating_QNAME = new QName(
            "http://webservices.amazon.com/AWSECommerceService/2011-04-01",
            "AudienceRating");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: am.ik.aws.apa.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link SellerLookupResponse }
     * 
     */
    public SellerLookupResponse createSellerLookupResponse() {
        return new SellerLookupResponse();
    }

    /**
     * Create an instance of {@link SellerListingSearch }
     * 
     */
    public SellerListingSearch createSellerListingSearch() {
        return new SellerListingSearch();
    }

    /**
     * Create an instance of {@link Collections.Collection.CollectionParent }
     * 
     */
    public Collections.Collection.CollectionParent createCollectionsCollectionCollectionParent() {
        return new Collections.Collection.CollectionParent();
    }

    /**
     * Create an instance of {@link TransactionItem.ChildTransactionItems }
     * 
     */
    public TransactionItem.ChildTransactionItems createTransactionItemChildTransactionItems() {
        return new TransactionItem.ChildTransactionItems();
    }

    /**
     * Create an instance of {@link SellerListingLookupRequest }
     * 
     */
    public SellerListingLookupRequest createSellerListingLookupRequest() {
        return new SellerListingLookupRequest();
    }

    /**
     * Create an instance of {@link SellerListingLookup }
     * 
     */
    public SellerListingLookup createSellerListingLookup() {
        return new SellerListingLookup();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link ItemAttributes.ItemDimensions }
     * 
     */
    public ItemAttributes.ItemDimensions createItemAttributesItemDimensions() {
        return new ItemAttributes.ItemDimensions();
    }

    /**
     * Create an instance of {@link ItemSearch }
     * 
     */
    public ItemSearch createItemSearch() {
        return new ItemSearch();
    }

    /**
     * Create an instance of {@link CartAddRequest }
     * 
     */
    public CartAddRequest createCartAddRequest() {
        return new CartAddRequest();
    }

    /**
     * Create an instance of {@link VehiclePartFit }
     * 
     */
    public VehiclePartFit createVehiclePartFit() {
        return new VehiclePartFit();
    }

    /**
     * Create an instance of {@link ItemAttributes.Creator }
     * 
     */
    public ItemAttributes.Creator createItemAttributesCreator() {
        return new ItemAttributes.Creator();
    }

    /**
     * Create an instance of {@link VehicleDriveType }
     * 
     */
    public VehicleDriveType createVehicleDriveType() {
        return new VehicleDriveType();
    }

    /**
     * Create an instance of {@link ListmaniaLists.ListmaniaList }
     * 
     */
    public ListmaniaLists.ListmaniaList createListmaniaListsListmaniaList() {
        return new ListmaniaLists.ListmaniaList();
    }

    /**
     * Create an instance of {@link BrowseNodeLookupResponse }
     * 
     */
    public BrowseNodeLookupResponse createBrowseNodeLookupResponse() {
        return new BrowseNodeLookupResponse();
    }

    /**
     * Create an instance of {@link CartAddRequest.Items.Item }
     * 
     */
    public CartAddRequest.Items.Item createCartAddRequestItemsItem() {
        return new CartAddRequest.Items.Item();
    }

    /**
     * Create an instance of {@link SearchInside }
     * 
     */
    public SearchInside createSearchInside() {
        return new SearchInside();
    }

    /**
     * Create an instance of {@link ResponseGroupInformation.Elements }
     * 
     */
    public ResponseGroupInformation.Elements createResponseGroupInformationElements() {
        return new ResponseGroupInformation.Elements();
    }

    /**
     * Create an instance of {@link TagLookupResponse }
     * 
     */
    public TagLookupResponse createTagLookupResponse() {
        return new TagLookupResponse();
    }

    /**
     * Create an instance of {@link SimilarityLookupRequest }
     * 
     */
    public SimilarityLookupRequest createSimilarityLookupRequest() {
        return new SimilarityLookupRequest();
    }

    /**
     * Create an instance of {@link UniversalListItem }
     * 
     */
    public UniversalListItem createUniversalListItem() {
        return new UniversalListItem();
    }

    /**
     * Create an instance of {@link Variations }
     * 
     */
    public Variations createVariations() {
        return new Variations();
    }

    /**
     * Create an instance of {@link Collections.Collection.CollectionSummary }
     * 
     */
    public Collections.Collection.CollectionSummary createCollectionsCollectionCollectionSummary() {
        return new Collections.Collection.CollectionSummary();
    }

    /**
     * Create an instance of {@link SimilarViewedProducts }
     * 
     */
    public SimilarViewedProducts createSimilarViewedProducts() {
        return new SimilarViewedProducts();
    }

    /**
     * Create an instance of {@link TopItemSet }
     * 
     */
    public TopItemSet createTopItemSet() {
        return new TopItemSet();
    }

    /**
     * Create an instance of {@link TransactionLookupRequest }
     * 
     */
    public TransactionLookupRequest createTransactionLookupRequest() {
        return new TransactionLookupRequest();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link ItemLookupResponse }
     * 
     */
    public ItemLookupResponse createItemLookupResponse() {
        return new ItemLookupResponse();
    }

    /**
     * Create an instance of {@link VehicleWheelbaseOptions }
     * 
     */
    public VehicleWheelbaseOptions createVehicleWheelbaseOptions() {
        return new VehicleWheelbaseOptions();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link NewReleases.NewRelease }
     * 
     */
    public NewReleases.NewRelease createNewReleasesNewRelease() {
        return new NewReleases.NewRelease();
    }

    /**
     * Create an instance of {@link BrowseNodeLookup }
     * 
     */
    public BrowseNodeLookup createBrowseNodeLookup() {
        return new BrowseNodeLookup();
    }

    /**
     * Create an instance of {@link am.ik.aws.apa.jaxws.Item.Subjects }
     * 
     */
    public am.ik.aws.apa.jaxws.Item.Subjects createItemSubjects() {
        return new am.ik.aws.apa.jaxws.Item.Subjects();
    }

    /**
     * Create an instance of {@link PromotionBenefits }
     * 
     */
    public PromotionBenefits createPromotionBenefits() {
        return new PromotionBenefits();
    }

    /**
     * Create an instance of {@link ItemAttributes.EANList }
     * 
     */
    public ItemAttributes.EANList createItemAttributesEANList() {
        return new ItemAttributes.EANList();
    }

    /**
     * Create an instance of {@link SellerListings }
     * 
     */
    public SellerListings createSellerListings() {
        return new SellerListings();
    }

    /**
     * Create an instance of {@link MultiOperationResponse }
     * 
     */
    public MultiOperationResponse createMultiOperationResponse() {
        return new MultiOperationResponse();
    }

    /**
     * Create an instance of {@link Customer.Location }
     * 
     */
    public Customer.Location createCustomerLocation() {
        return new Customer.Location();
    }

    /**
     * Create an instance of {@link TransactionLookupResponse }
     * 
     */
    public TransactionLookupResponse createTransactionLookupResponse() {
        return new TransactionLookupResponse();
    }

    /**
     * Create an instance of {@link CartModifyRequest.Items.Item }
     * 
     */
    public CartModifyRequest.Items.Item createCartModifyRequestItemsItem() {
        return new CartModifyRequest.Items.Item();
    }

    /**
     * Create an instance of {@link CartClearRequest }
     * 
     */
    public CartClearRequest createCartClearRequest() {
        return new CartClearRequest();
    }

    /**
     * Create an instance of {@link Part }
     * 
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link Promotion.Summary }
     * 
     */
    public Promotion.Summary createPromotionSummary() {
        return new Promotion.Summary();
    }

    /**
     * Create an instance of {@link SimilarityLookup }
     * 
     */
    public SimilarityLookup createSimilarityLookup() {
        return new SimilarityLookup();
    }

    /**
     * Create an instance of
     * {@link Transaction.Shipments.Shipment.ShipmentItems }
     * 
     */
    public Transaction.Shipments.Shipment.ShipmentItems createTransactionShipmentsShipmentShipmentItems() {
        return new Transaction.Shipments.Shipment.ShipmentItems();
    }

    /**
     * Create an instance of {@link FitmentAttributes }
     * 
     */
    public FitmentAttributes createFitmentAttributes() {
        return new FitmentAttributes();
    }

    /**
     * Create an instance of {@link OperationInformation }
     * 
     */
    public OperationInformation createOperationInformation() {
        return new OperationInformation();
    }

    /**
     * Create an instance of {@link Bin }
     * 
     */
    public Bin createBin() {
        return new Bin();
    }

    /**
     * Create an instance of {@link VehicleEngine }
     * 
     */
    public VehicleEngine createVehicleEngine() {
        return new VehicleEngine();
    }

    /**
     * Create an instance of {@link SellerListingSearchResponse }
     * 
     */
    public SellerListingSearchResponse createSellerListingSearchResponse() {
        return new SellerListingSearchResponse();
    }

    /**
     * Create an instance of {@link Tracks }
     * 
     */
    public Tracks createTracks() {
        return new Tracks();
    }

    /**
     * Create an instance of {@link ItemSearchResponse }
     * 
     */
    public ItemSearchResponse createItemSearchResponse() {
        return new ItemSearchResponse();
    }

    /**
     * Create an instance of
     * {@link OperationInformation.AvailableResponseGroups }
     * 
     */
    public OperationInformation.AvailableResponseGroups createOperationInformationAvailableResponseGroups() {
        return new OperationInformation.AvailableResponseGroups();
    }

    /**
     * Create an instance of {@link Tags }
     * 
     */
    public Tags createTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link MissingVehicleAttributes }
     * 
     */
    public MissingVehicleAttributes createMissingVehicleAttributes() {
        return new MissingVehicleAttributes();
    }

    /**
     * Create an instance of {@link HelpResponse }
     * 
     */
    public HelpResponse createHelpResponse() {
        return new HelpResponse();
    }

    /**
     * Create an instance of {@link DecimalWithUnits }
     * 
     */
    public DecimalWithUnits createDecimalWithUnits() {
        return new DecimalWithUnits();
    }

    /**
     * Create an instance of {@link Transaction.Totals }
     * 
     */
    public Transaction.Totals createTransactionTotals() {
        return new Transaction.Totals();
    }

    /**
     * Create an instance of {@link SearchResultsMap }
     * 
     */
    public SearchResultsMap createSearchResultsMap() {
        return new SearchResultsMap();
    }

    /**
     * Create an instance of {@link Transaction.Shipments }
     * 
     */
    public Transaction.Shipments createTransactionShipments() {
        return new Transaction.Shipments();
    }

    /**
     * Create an instance of {@link BrowseNode.Ancestors }
     * 
     */
    public BrowseNode.Ancestors createBrowseNodeAncestors() {
        return new BrowseNode.Ancestors();
    }

    /**
     * Create an instance of {@link VehicleYear }
     * 
     */
    public VehicleYear createVehicleYear() {
        return new VehicleYear();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link VehicleTransmission }
     * 
     */
    public VehicleTransmission createVehicleTransmission() {
        return new VehicleTransmission();
    }

    /**
     * Create an instance of {@link TopSellers }
     * 
     */
    public TopSellers createTopSellers() {
        return new TopSellers();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes }
     * 
     */
    public MerchantItemAttributes createMerchantItemAttributes() {
        return new MerchantItemAttributes();
    }

    /**
     * Create an instance of {@link Guide }
     * 
     */
    public Guide createGuide() {
        return new Guide();
    }

    /**
     * Create an instance of {@link VariationDimensions }
     * 
     */
    public VariationDimensions createVariationDimensions() {
        return new VariationDimensions();
    }

    /**
     * Create an instance of {@link MultiOperation }
     * 
     */
    public MultiOperation createMultiOperation() {
        return new MultiOperation();
    }

    /**
     * Create an instance of {@link CartCreateRequest }
     * 
     */
    public CartCreateRequest createCartCreateRequest() {
        return new CartCreateRequest();
    }

    /**
     * Create an instance of {@link Fitment }
     * 
     */
    public Fitment createFitment() {
        return new Fitment();
    }

    /**
     * Create an instance of {@link CartModifyRequest }
     * 
     */
    public CartModifyRequest createCartModifyRequest() {
        return new CartModifyRequest();
    }

    /**
     * Create an instance of {@link CartModifyRequest.Items }
     * 
     */
    public CartModifyRequest.Items createCartModifyRequestItems() {
        return new CartModifyRequest.Items();
    }

    /**
     * Create an instance of {@link Bin.BinParameter }
     * 
     */
    public Bin.BinParameter createBinBinParameter() {
        return new Bin.BinParameter();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link CartItem.MetaData }
     * 
     */
    public CartItem.MetaData createCartItemMetaData() {
        return new CartItem.MetaData();
    }

    /**
     * Create an instance of {@link ItemAttributes.Languages.Language }
     * 
     */
    public ItemAttributes.Languages.Language createItemAttributesLanguagesLanguage() {
        return new ItemAttributes.Languages.Language();
    }

    /**
     * Create an instance of {@link OtherCategoriesSimilarProducts }
     * 
     */
    public OtherCategoriesSimilarProducts createOtherCategoriesSimilarProducts() {
        return new OtherCategoriesSimilarProducts();
    }

    /**
     * Create an instance of {@link BrowseNodes }
     * 
     */
    public BrowseNodes createBrowseNodes() {
        return new BrowseNodes();
    }

    /**
     * Create an instance of {@link Promotion.Details }
     * 
     */
    public Promotion.Details createPromotionDetails() {
        return new Promotion.Details();
    }

    /**
     * Create an instance of {@link TagLookupRequest }
     * 
     */
    public TagLookupRequest createTagLookupRequest() {
        return new TagLookupRequest();
    }

    /**
     * Create an instance of {@link CartGetResponse }
     * 
     */
    public CartGetResponse createCartGetResponse() {
        return new CartGetResponse();
    }

    /**
     * Create an instance of {@link OfferListing.AvailabilityAttributes }
     * 
     */
    public OfferListing.AvailabilityAttributes createOfferListingAvailabilityAttributes() {
        return new OfferListing.AvailabilityAttributes();
    }

    /**
     * Create an instance of {@link CartItem.MetaData.KeyValuePair }
     * 
     */
    public CartItem.MetaData.KeyValuePair createCartItemMetaDataKeyValuePair() {
        return new CartItem.MetaData.KeyValuePair();
    }

    /**
     * Create an instance of {@link NonNegativeIntegerWithUnits }
     * 
     */
    public NonNegativeIntegerWithUnits createNonNegativeIntegerWithUnits() {
        return new NonNegativeIntegerWithUnits();
    }

    /**
     * Create an instance of {@link VehiclePartSearchRequest }
     * 
     */
    public VehiclePartSearchRequest createVehiclePartSearchRequest() {
        return new VehiclePartSearchRequest();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link OperationInformation.AvailableParameters }
     * 
     */
    public OperationInformation.AvailableParameters createOperationInformationAvailableParameters() {
        return new OperationInformation.AvailableParameters();
    }

    /**
     * Create an instance of {@link TransactionLookup }
     * 
     */
    public TransactionLookup createTransactionLookup() {
        return new TransactionLookup();
    }

    /**
     * Create an instance of {@link VehiclePartLookup }
     * 
     */
    public VehiclePartLookup createVehiclePartLookup() {
        return new VehiclePartLookup();
    }

    /**
     * Create an instance of {@link ImageSet }
     * 
     */
    public ImageSet createImageSet() {
        return new ImageSet();
    }

    /**
     * Create an instance of {@link ResponseGroupInformation.ValidOperations }
     * 
     */
    public ResponseGroupInformation.ValidOperations createResponseGroupInformationValidOperations() {
        return new ResponseGroupInformation.ValidOperations();
    }

    /**
     * Create an instance of {@link Seller.SellerFeedbackSummary }
     * 
     */
    public Seller.SellerFeedbackSummary createSellerSellerFeedbackSummary() {
        return new Seller.SellerFeedbackSummary();
    }

    /**
     * Create an instance of {@link Reviewer }
     * 
     */
    public Reviewer createReviewer() {
        return new Reviewer();
    }

    /**
     * Create an instance of {@link VehicleBodyStyleOptions }
     * 
     */
    public VehicleBodyStyleOptions createVehicleBodyStyleOptions() {
        return new VehicleBodyStyleOptions();
    }

    /**
     * Create an instance of {@link SellerListing }
     * 
     */
    public SellerListing createSellerListing() {
        return new SellerListing();
    }

    /**
     * Create an instance of {@link VehiclePartSearch }
     * 
     */
    public VehiclePartSearch createVehiclePartSearch() {
        return new VehiclePartSearch();
    }

    /**
     * Create an instance of {@link CustomerContentLookupResponse }
     * 
     */
    public CustomerContentLookupResponse createCustomerContentLookupResponse() {
        return new CustomerContentLookupResponse();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.VendorRebate }
     * 
     */
    public MerchantItemAttributes.VendorRebate createMerchantItemAttributesVendorRebate() {
        return new MerchantItemAttributes.VendorRebate();
    }

    /**
     * Create an instance of
     * {@link OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct }
     * 
     */
    public OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct createOtherCategoriesSimilarProductsOtherCategoriesSimilarProduct() {
        return new OtherCategoriesSimilarProducts.OtherCategoriesSimilarProduct();
    }

    /**
     * Create an instance of {@link Merchant.Location }
     * 
     */
    public Merchant.Location createMerchantLocation() {
        return new Merchant.Location();
    }

    /**
     * Create an instance of {@link VehicleMakes }
     * 
     */
    public VehicleMakes createVehicleMakes() {
        return new VehicleMakes();
    }

    /**
     * Create an instance of {@link StringWithUnits }
     * 
     */
    public StringWithUnits createStringWithUnits() {
        return new StringWithUnits();
    }

    /**
     * Create an instance of {@link am.ik.aws.apa.jaxws.Item.AlternateVersions }
     * 
     */
    public am.ik.aws.apa.jaxws.Item.AlternateVersions createItemAlternateVersions() {
        return new am.ik.aws.apa.jaxws.Item.AlternateVersions();
    }

    /**
     * Create an instance of {@link EditorialReviews }
     * 
     */
    public EditorialReviews createEditorialReviews() {
        return new EditorialReviews();
    }

    /**
     * Create an instance of {@link RelatedItem }
     * 
     */
    public RelatedItem createRelatedItem() {
        return new RelatedItem();
    }

    /**
     * Create an instance of {@link Accessories.Accessory }
     * 
     */
    public Accessories.Accessory createAccessoriesAccessory() {
        return new Accessories.Accessory();
    }

    /**
     * Create an instance of {@link SellerLookupRequest }
     * 
     */
    public SellerLookupRequest createSellerLookupRequest() {
        return new SellerLookupRequest();
    }

    /**
     * Create an instance of {@link ListSearchRequest }
     * 
     */
    public ListSearchRequest createListSearchRequest() {
        return new ListSearchRequest();
    }

    /**
     * Create an instance of {@link am.ik.aws.apa.jaxws.Item.ImageSets }
     * 
     */
    public am.ik.aws.apa.jaxws.Item.ImageSets createItemImageSets() {
        return new am.ik.aws.apa.jaxws.Item.ImageSets();
    }

    /**
     * Create an instance of {@link VehicleBrakesOptions }
     * 
     */
    public VehicleBrakesOptions createVehicleBrakesOptions() {
        return new VehicleBrakesOptions();
    }

    /**
     * Create an instance of {@link Fitments }
     * 
     */
    public Fitments createFitments() {
        return new Fitments();
    }

    /**
     * Create an instance of {@link Tagging }
     * 
     */
    public Tagging createTagging() {
        return new Tagging();
    }

    /**
     * Create an instance of {@link ItemAttributes.PackageDimensions }
     * 
     */
    public ItemAttributes.PackageDimensions createItemAttributesPackageDimensions() {
        return new ItemAttributes.PackageDimensions();
    }

    /**
     * Create an instance of {@link OperationRequest }
     * 
     */
    public OperationRequest createOperationRequest() {
        return new OperationRequest();
    }

    /**
     * Create an instance of
     * {@link am.ik.aws.apa.jaxws.Item.AlternateVersions.AlternateVersion }
     * 
     */
    public am.ik.aws.apa.jaxws.Item.AlternateVersions.AlternateVersion createItemAlternateVersionsAlternateVersion() {
        return new am.ik.aws.apa.jaxws.Item.AlternateVersions.AlternateVersion();
    }

    /**
     * Create an instance of {@link CartClear }
     * 
     */
    public CartClear createCartClear() {
        return new CartClear();
    }

    /**
     * Create an instance of {@link SellerListingLookupResponse }
     * 
     */
    public SellerListingLookupResponse createSellerListingLookupResponse() {
        return new SellerListingLookupResponse();
    }

    /**
     * Create an instance of {@link CartAddRequest.Items }
     * 
     */
    public CartAddRequest.Items createCartAddRequestItems() {
        return new CartAddRequest.Items();
    }

    /**
     * Create an instance of {@link SearchResultsMap.SearchIndex }
     * 
     */
    public SearchResultsMap.SearchIndex createSearchResultsMapSearchIndex() {
        return new SearchResultsMap.SearchIndex();
    }

    /**
     * Create an instance of {@link TopSellers.TopSeller }
     * 
     */
    public TopSellers.TopSeller createTopSellersTopSeller() {
        return new TopSellers.TopSeller();
    }

    /**
     * Create an instance of {@link VehicleSpringTypes }
     * 
     */
    public VehicleSpringTypes createVehicleSpringTypes() {
        return new VehicleSpringTypes();
    }

    /**
     * Create an instance of {@link BrowseNode.Children }
     * 
     */
    public BrowseNode.Children createBrowseNodeChildren() {
        return new BrowseNode.Children();
    }

    /**
     * Create an instance of {@link SearchBinSet }
     * 
     */
    public SearchBinSet createSearchBinSet() {
        return new SearchBinSet();
    }

    /**
     * Create an instance of {@link CartClearResponse }
     * 
     */
    public CartClearResponse createCartClearResponse() {
        return new CartClearResponse();
    }

    /**
     * Create an instance of {@link PromotionEligibilityRequirements }
     * 
     */
    public PromotionEligibilityRequirements createPromotionEligibilityRequirements() {
        return new PromotionEligibilityRequirements();
    }

    /**
     * Create an instance of {@link Transaction.TransactionItems }
     * 
     */
    public Transaction.TransactionItems createTransactionTransactionItems() {
        return new Transaction.TransactionItems();
    }

    /**
     * Create an instance of {@link ItemAttributes.UPCList }
     * 
     */
    public ItemAttributes.UPCList createItemAttributesUPCList() {
        return new ItemAttributes.UPCList();
    }

    /**
     * Create an instance of {@link BrowseNodeLookupRequest }
     * 
     */
    public BrowseNodeLookupRequest createBrowseNodeLookupRequest() {
        return new BrowseNodeLookupRequest();
    }

    /**
     * Create an instance of {@link Transactions }
     * 
     */
    public Transactions createTransactions() {
        return new Transactions();
    }

    /**
     * Create an instance of {@link CustomerContentSearch }
     * 
     */
    public CustomerContentSearch createCustomerContentSearch() {
        return new CustomerContentSearch();
    }

    /**
     * Create an instance of {@link CartCreateResponse }
     * 
     */
    public CartCreateResponse createCartCreateResponse() {
        return new CartCreateResponse();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link ItemSearchRequest }
     * 
     */
    public ItemSearchRequest createItemSearchRequest() {
        return new ItemSearchRequest();
    }

    /**
     * Create an instance of {@link VehiclePartLookupRequest }
     * 
     */
    public VehiclePartLookupRequest createVehiclePartLookupRequest() {
        return new VehiclePartLookupRequest();
    }

    /**
     * Create an instance of {@link OfferAttributes }
     * 
     */
    public OfferAttributes createOfferAttributes() {
        return new OfferAttributes();
    }

    /**
     * Create an instance of {@link VehiclePartLookupResponse }
     * 
     */
    public VehiclePartLookupResponse createVehiclePartLookupResponse() {
        return new VehiclePartLookupResponse();
    }

    /**
     * Create an instance of {@link Transaction.Shipments.Shipment.Packages }
     * 
     */
    public Transaction.Shipments.Shipment.Packages createTransactionShipmentsShipmentPackages() {
        return new Transaction.Shipments.Shipment.Packages();
    }

    /**
     * Create an instance of {@link CartCreateRequest.Items }
     * 
     */
    public CartCreateRequest.Items createCartCreateRequestItems() {
        return new CartCreateRequest.Items();
    }

    /**
     * Create an instance of {@link Promotions }
     * 
     */
    public Promotions createPromotions() {
        return new Promotions();
    }

    /**
     * Create an instance of {@link Arguments }
     * 
     */
    public Arguments createArguments() {
        return new Arguments();
    }

    /**
     * Create an instance of {@link Arguments.Argument }
     * 
     */
    public Arguments.Argument createArgumentsArgument() {
        return new Arguments.Argument();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.Creator }
     * 
     */
    public MerchantItemAttributes.Creator createMerchantItemAttributesCreator() {
        return new MerchantItemAttributes.Creator();
    }

    /**
     * Create an instance of
     * {@link Seller.SellerFeedbackSummary.FeedbackDateRange }
     * 
     */
    public Seller.SellerFeedbackSummary.FeedbackDateRange createSellerSellerFeedbackSummaryFeedbackDateRange() {
        return new Seller.SellerFeedbackSummary.FeedbackDateRange();
    }

    /**
     * Create an instance of {@link ListSearch }
     * 
     */
    public ListSearch createListSearch() {
        return new ListSearch();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.Languages }
     * 
     */
    public MerchantItemAttributes.Languages createMerchantItemAttributesLanguages() {
        return new MerchantItemAttributes.Languages();
    }

    /**
     * Create an instance of {@link HelpRequest }
     * 
     */
    public HelpRequest createHelpRequest() {
        return new HelpRequest();
    }

    /**
     * Create an instance of {@link ItemAttributes }
     * 
     */
    public ItemAttributes createItemAttributes() {
        return new ItemAttributes();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of
     * {@link am.ik.aws.apa.jaxws.Item.VariationAttributes }
     * 
     */
    public am.ik.aws.apa.jaxws.Item.VariationAttributes createItemVariationAttributes() {
        return new am.ik.aws.apa.jaxws.Item.VariationAttributes();
    }

    /**
     * Create an instance of {@link PromotionItemApplicability }
     * 
     */
    public PromotionItemApplicability createPromotionItemApplicability() {
        return new PromotionItemApplicability();
    }

    /**
     * Create an instance of {@link OfferListing }
     * 
     */
    public OfferListing createOfferListing() {
        return new OfferListing();
    }

    /**
     * Create an instance of {@link am.ik.aws.apa.jaxws.Items }
     * 
     */
    public am.ik.aws.apa.jaxws.Items createItems() {
        return new am.ik.aws.apa.jaxws.Items();
    }

    /**
     * Create an instance of {@link VehicleBedOptions }
     * 
     */
    public VehicleBedOptions createVehicleBedOptions() {
        return new VehicleBedOptions();
    }

    /**
     * Create an instance of {@link PromotionBenefit }
     * 
     */
    public PromotionBenefit createPromotionBenefit() {
        return new PromotionBenefit();
    }

    /**
     * Create an instance of {@link RelatedItems }
     * 
     */
    public RelatedItems createRelatedItems() {
        return new RelatedItems();
    }

    /**
     * Create an instance of {@link CorrectedQuery }
     * 
     */
    public CorrectedQuery createCorrectedQuery() {
        return new CorrectedQuery();
    }

    /**
     * Create an instance of {@link Accessories }
     * 
     */
    public Accessories createAccessories() {
        return new Accessories();
    }

    /**
     * Create an instance of {@link Collections }
     * 
     */
    public Collections createCollections() {
        return new Collections();
    }

    /**
     * Create an instance of {@link ItemLookupRequest }
     * 
     */
    public ItemLookupRequest createItemLookupRequest() {
        return new ItemLookupRequest();
    }

    /**
     * Create an instance of {@link SellerFeedback.Feedback }
     * 
     */
    public SellerFeedback.Feedback createSellerFeedbackFeedback() {
        return new SellerFeedback.Feedback();
    }

    /**
     * Create an instance of {@link VehicleYears }
     * 
     */
    public VehicleYears createVehicleYears() {
        return new VehicleYears();
    }

    /**
     * Create an instance of {@link SearchBinSets }
     * 
     */
    public SearchBinSets createSearchBinSets() {
        return new SearchBinSets();
    }

    /**
     * Create an instance of {@link VehicleMake }
     * 
     */
    public VehicleMake createVehicleMake() {
        return new VehicleMake();
    }

    /**
     * Create an instance of {@link Tracks.Disc }
     * 
     */
    public Tracks.Disc createTracksDisc() {
        return new Tracks.Disc();
    }

    /**
     * Create an instance of {@link SimilarProducts.SimilarProduct }
     * 
     */
    public SimilarProducts.SimilarProduct createSimilarProductsSimilarProduct() {
        return new SimilarProducts.SimilarProduct();
    }

    /**
     * Create an instance of {@link VehicleSearchRequest }
     * 
     */
    public VehicleSearchRequest createVehicleSearchRequest() {
        return new VehicleSearchRequest();
    }

    /**
     * Create an instance of {@link VehicleSpringTypesOptions }
     * 
     */
    public VehicleSpringTypesOptions createVehicleSpringTypesOptions() {
        return new VehicleSpringTypesOptions();
    }

    /**
     * Create an instance of {@link CartGet }
     * 
     */
    public CartGet createCartGet() {
        return new CartGet();
    }

    /**
     * Create an instance of {@link TopItemSet.TopItem }
     * 
     */
    public TopItemSet.TopItem createTopItemSetTopItem() {
        return new TopItemSet.TopItem();
    }

    /**
     * Create an instance of
     * {@link Transaction.Shipments.Shipment.Packages.Package }
     * 
     */
    public Transaction.Shipments.Shipment.Packages.Package createTransactionShipmentsShipmentPackagesPackage() {
        return new Transaction.Shipments.Shipment.Packages.Package();
    }

    /**
     * Create an instance of {@link VehicleWheelbase }
     * 
     */
    public VehicleWheelbase createVehicleWheelbase() {
        return new VehicleWheelbase();
    }

    /**
     * Create an instance of {@link VehicleDriveTypeOptions }
     * 
     */
    public VehicleDriveTypeOptions createVehicleDriveTypeOptions() {
        return new VehicleDriveTypeOptions();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CartModify }
     * 
     */
    public CartModify createCartModify() {
        return new CartModify();
    }

    /**
     * Create an instance of {@link ListSearchResponse }
     * 
     */
    public ListSearchResponse createListSearchResponse() {
        return new ListSearchResponse();
    }

    /**
     * Create an instance of {@link Sellers }
     * 
     */
    public Sellers createSellers() {
        return new Sellers();
    }

    /**
     * Create an instance of {@link VehicleParts }
     * 
     */
    public VehicleParts createVehicleParts() {
        return new VehicleParts();
    }

    /**
     * Create an instance of {@link SearchInside.Excerpt }
     * 
     */
    public SearchInside.Excerpt createSearchInsideExcerpt() {
        return new SearchInside.Excerpt();
    }

    /**
     * Create an instance of {@link CartAdd }
     * 
     */
    public CartAdd createCartAdd() {
        return new CartAdd();
    }

    /**
     * Create an instance of {@link TransactionItem }
     * 
     */
    public TransactionItem createTransactionItem() {
        return new TransactionItem();
    }

    /**
     * Create an instance of {@link SellerLookup }
     * 
     */
    public SellerLookup createSellerLookup() {
        return new SellerLookup();
    }

    /**
     * Create an instance of {@link Offers }
     * 
     */
    public Offers createOffers() {
        return new Offers();
    }

    /**
     * Create an instance of {@link Collections.Collection }
     * 
     */
    public Collections.Collection createCollectionsCollection() {
        return new Collections.Collection();
    }

    /**
     * Create an instance of {@link CartAddResponse }
     * 
     */
    public CartAddResponse createCartAddResponse() {
        return new CartAddResponse();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.PackageDimensions }
     * 
     */
    public MerchantItemAttributes.PackageDimensions createMerchantItemAttributesPackageDimensions() {
        return new MerchantItemAttributes.PackageDimensions();
    }

    /**
     * Create an instance of {@link OfferSummary }
     * 
     */
    public OfferSummary createOfferSummary() {
        return new OfferSummary();
    }

    /**
     * Create an instance of {@link VehicleSearchResponse }
     * 
     */
    public VehicleSearchResponse createVehicleSearchResponse() {
        return new VehicleSearchResponse();
    }

    /**
     * Create an instance of {@link LoyaltyPoints }
     * 
     */
    public LoyaltyPoints createLoyaltyPoints() {
        return new LoyaltyPoints();
    }

    /**
     * Create an instance of {@link Help }
     * 
     */
    public Help createHelp() {
        return new Help();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link CustomerReviews }
     * 
     */
    public CustomerReviews createCustomerReviews() {
        return new CustomerReviews();
    }

    /**
     * Create an instance of {@link Transaction.Shipments.Shipment }
     * 
     */
    public Transaction.Shipments.Shipment createTransactionShipmentsShipment() {
        return new Transaction.Shipments.Shipment();
    }

    /**
     * Create an instance of {@link VehicleEngineOptions }
     * 
     */
    public VehicleEngineOptions createVehicleEngineOptions() {
        return new VehicleEngineOptions();
    }

    /**
     * Create an instance of {@link VariationSummary }
     * 
     */
    public VariationSummary createVariationSummary() {
        return new VariationSummary();
    }

    /**
     * Create an instance of {@link VariationAttribute }
     * 
     */
    public VariationAttribute createVariationAttribute() {
        return new VariationAttribute();
    }

    /**
     * Create an instance of {@link ItemLookup }
     * 
     */
    public ItemLookup createItemLookup() {
        return new ItemLookup();
    }

    /**
     * Create an instance of {@link SimilarityLookupResponse }
     * 
     */
    public SimilarityLookupResponse createSimilarityLookupResponse() {
        return new SimilarityLookupResponse();
    }

    /**
     * Create an instance of {@link HTTPHeaders.Header }
     * 
     */
    public HTTPHeaders.Header createHTTPHeadersHeader() {
        return new HTTPHeaders.Header();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link VehicleTrims }
     * 
     */
    public VehicleTrims createVehicleTrims() {
        return new VehicleTrims();
    }

    /**
     * Create an instance of {@link Lists }
     * 
     */
    public Lists createLists() {
        return new Lists();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.Languages.Language }
     * 
     */
    public MerchantItemAttributes.Languages.Language createMerchantItemAttributesLanguagesLanguage() {
        return new MerchantItemAttributes.Languages.Language();
    }

    /**
     * Create an instance of {@link VehicleTransmissionOptions }
     * 
     */
    public VehicleTransmissionOptions createVehicleTransmissionOptions() {
        return new VehicleTransmissionOptions();
    }

    /**
     * Create an instance of {@link PartBrowseNodeBins }
     * 
     */
    public PartBrowseNodeBins createPartBrowseNodeBins() {
        return new PartBrowseNodeBins();
    }

    /**
     * Create an instance of {@link NewReleases }
     * 
     */
    public NewReleases createNewReleases() {
        return new NewReleases();
    }

    /**
     * Create an instance of {@link CartCreateRequest.Items.Item.MetaData }
     * 
     */
    public CartCreateRequest.Items.Item.MetaData createCartCreateRequestItemsItemMetaData() {
        return new CartCreateRequest.Items.Item.MetaData();
    }

    /**
     * Create an instance of {@link CustomerContentSearchRequest }
     * 
     */
    public CustomerContentSearchRequest createCustomerContentSearchRequest() {
        return new CustomerContentSearchRequest();
    }

    /**
     * Create an instance of {@link ItemLink }
     * 
     */
    public ItemLink createItemLink() {
        return new ItemLink();
    }

    /**
     * Create an instance of {@link Seller.Location }
     * 
     */
    public Seller.Location createSellerLocation() {
        return new Seller.Location();
    }

    /**
     * Create an instance of {@link VehicleSteeringOptions }
     * 
     */
    public VehicleSteeringOptions createVehicleSteeringOptions() {
        return new VehicleSteeringOptions();
    }

    /**
     * Create an instance of {@link ListLookupRequest }
     * 
     */
    public ListLookupRequest createListLookupRequest() {
        return new ListLookupRequest();
    }

    /**
     * Create an instance of {@link ListLookupResponse }
     * 
     */
    public ListLookupResponse createListLookupResponse() {
        return new ListLookupResponse();
    }

    /**
     * Create an instance of {@link CartCreateRequest.Items.Item }
     * 
     */
    public CartCreateRequest.Items.Item createCartCreateRequestItemsItem() {
        return new CartCreateRequest.Items.Item();
    }

    /**
     * Create an instance of {@link TaggedGuides }
     * 
     */
    public TaggedGuides createTaggedGuides() {
        return new TaggedGuides();
    }

    /**
     * Create an instance of {@link EditorialReview }
     * 
     */
    public EditorialReview createEditorialReview() {
        return new EditorialReview();
    }

    /**
     * Create an instance of {@link SimilarProducts }
     * 
     */
    public SimilarProducts createSimilarProducts() {
        return new SimilarProducts();
    }

    /**
     * Create an instance of {@link CartGetRequest }
     * 
     */
    public CartGetRequest createCartGetRequest() {
        return new CartGetRequest();
    }

    /**
     * Create an instance of {@link CartModifyResponse }
     * 
     */
    public CartModifyResponse createCartModifyResponse() {
        return new CartModifyResponse();
    }

    /**
     * Create an instance of {@link VehicleBodyStyle }
     * 
     */
    public VehicleBodyStyle createVehicleBodyStyle() {
        return new VehicleBodyStyle();
    }

    /**
     * Create an instance of {@link TagLookup }
     * 
     */
    public TagLookup createTagLookup() {
        return new TagLookup();
    }

    /**
     * Create an instance of {@link OperationInformation.DefaultResponseGroups }
     * 
     */
    public OperationInformation.DefaultResponseGroups createOperationInformationDefaultResponseGroups() {
        return new OperationInformation.DefaultResponseGroups();
    }

    /**
     * Create an instance of {@link ItemLinks }
     * 
     */
    public ItemLinks createItemLinks() {
        return new ItemLinks();
    }

    /**
     * Create an instance of {@link VehicleModels }
     * 
     */
    public VehicleModels createVehicleModels() {
        return new VehicleModels();
    }

    /**
     * Create an instance of {@link VehiclePartSearchResponse }
     * 
     */
    public VehiclePartSearchResponse createVehiclePartSearchResponse() {
        return new VehiclePartSearchResponse();
    }

    /**
     * Create an instance of
     * {@link Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating }
     * 
     */
    public Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating createSellerSellerFeedbackSummaryFeedbackDateRangeSellerFeedbackRating() {
        return new Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating();
    }

    /**
     * Create an instance of {@link VehicleBed }
     * 
     */
    public VehicleBed createVehicleBed() {
        return new VehicleBed();
    }

    /**
     * Create an instance of {@link SavedForLaterItems }
     * 
     */
    public SavedForLaterItems createSavedForLaterItems() {
        return new SavedForLaterItems();
    }

    /**
     * Create an instance of {@link am.ik.aws.apa.jaxws.Item }
     * 
     */
    public am.ik.aws.apa.jaxws.Item createItem() {
        return new am.ik.aws.apa.jaxws.Item();
    }

    /**
     * Create an instance of {@link OfferListing.ShippingCharge }
     * 
     */
    public OfferListing.ShippingCharge createOfferListingShippingCharge() {
        return new OfferListing.ShippingCharge();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link OfferListing.QuantityRestriction }
     * 
     */
    public OfferListing.QuantityRestriction createOfferListingQuantityRestriction() {
        return new OfferListing.QuantityRestriction();
    }

    /**
     * Create an instance of {@link CartCreate }
     * 
     */
    public CartCreate createCartCreate() {
        return new CartCreate();
    }

    /**
     * Create an instance of {@link VehicleModel }
     * 
     */
    public VehicleModel createVehicleModel() {
        return new VehicleModel();
    }

    /**
     * Create an instance of {@link PartBrandBins }
     * 
     */
    public PartBrandBins createPartBrandBins() {
        return new PartBrandBins();
    }

    /**
     * Create an instance of {@link VehicleTrim }
     * 
     */
    public VehicleTrim createVehicleTrim() {
        return new VehicleTrim();
    }

    /**
     * Create an instance of {@link CustomerContentLookup }
     * 
     */
    public CustomerContentLookup createCustomerContentLookup() {
        return new CustomerContentLookup();
    }

    /**
     * Create an instance of {@link VehicleMfrBodyCode }
     * 
     */
    public VehicleMfrBodyCode createVehicleMfrBodyCode() {
        return new VehicleMfrBodyCode();
    }

    /**
     * Create an instance of {@link TaggedItems }
     * 
     */
    public TaggedItems createTaggedItems() {
        return new TaggedItems();
    }

    /**
     * Create an instance of {@link ListLookup }
     * 
     */
    public ListLookup createListLookup() {
        return new ListLookup();
    }

    /**
     * Create an instance of {@link TaggedListmaniaLists }
     * 
     */
    public TaggedListmaniaLists createTaggedListmaniaLists() {
        return new TaggedListmaniaLists();
    }

    /**
     * Create an instance of {@link VehicleOptions }
     * 
     */
    public VehicleOptions createVehicleOptions() {
        return new VehicleOptions();
    }

    /**
     * Create an instance of {@link PromotionEligibilityRequirement }
     * 
     */
    public PromotionEligibilityRequirement createPromotionEligibilityRequirement() {
        return new PromotionEligibilityRequirement();
    }

    /**
     * Create an instance of {@link Collections.Collection.CollectionItem }
     * 
     */
    public Collections.Collection.CollectionItem createCollectionsCollectionCollectionItem() {
        return new Collections.Collection.CollectionItem();
    }

    /**
     * Create an instance of {@link OperationInformation.RequiredParameters }
     * 
     */
    public OperationInformation.RequiredParameters createOperationInformationRequiredParameters() {
        return new OperationInformation.RequiredParameters();
    }

    /**
     * Create an instance of {@link SimilarViewedProducts.SimilarViewedProduct }
     * 
     */
    public SimilarViewedProducts.SimilarViewedProduct createSimilarViewedProductsSimilarViewedProduct() {
        return new SimilarViewedProducts.SimilarViewedProduct();
    }

    /**
     * Create an instance of {@link VehicleBrakes }
     * 
     */
    public VehicleBrakes createVehicleBrakes() {
        return new VehicleBrakes();
    }

    /**
     * Create an instance of {@link SellerListingSearchRequest }
     * 
     */
    public SellerListingSearchRequest createSellerListingSearchRequest() {
        return new SellerListingSearchRequest();
    }

    /**
     * Create an instance of {@link VehicleSteering }
     * 
     */
    public VehicleSteering createVehicleSteering() {
        return new VehicleSteering();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link BrowseNode.Properties }
     * 
     */
    public BrowseNode.Properties createBrowseNodeProperties() {
        return new BrowseNode.Properties();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link MerchantItemAttributes.ItemDimensions }
     * 
     */
    public MerchantItemAttributes.ItemDimensions createMerchantItemAttributesItemDimensions() {
        return new MerchantItemAttributes.ItemDimensions();
    }

    /**
     * Create an instance of {@link ItemAttributes.Languages }
     * 
     */
    public ItemAttributes.Languages createItemAttributesLanguages() {
        return new ItemAttributes.Languages();
    }

    /**
     * Create an instance of {@link VehicleMfrBodyCodeOptions }
     * 
     */
    public VehicleMfrBodyCodeOptions createVehicleMfrBodyCodeOptions() {
        return new VehicleMfrBodyCodeOptions();
    }

    /**
     * Create an instance of {@link Errors.Error }
     * 
     */
    public Errors.Error createErrorsError() {
        return new Errors.Error();
    }

    /**
     * Create an instance of {@link ListmaniaLists }
     * 
     */
    public ListmaniaLists createListmaniaLists() {
        return new ListmaniaLists();
    }

    /**
     * Create an instance of {@link Tracks.Disc.Track }
     * 
     */
    public Tracks.Disc.Track createTracksDiscTrack() {
        return new Tracks.Disc.Track();
    }

    /**
     * Create an instance of {@link SellerFeedback }
     * 
     */
    public SellerFeedback createSellerFeedback() {
        return new SellerFeedback();
    }

    /**
     * Create an instance of {@link ItemAttributes.CatalogNumberList }
     * 
     */
    public ItemAttributes.CatalogNumberList createItemAttributesCatalogNumberList() {
        return new ItemAttributes.CatalogNumberList();
    }

    /**
     * Create an instance of {@link CustomerContentLookupRequest }
     * 
     */
    public CustomerContentLookupRequest createCustomerContentLookupRequest() {
        return new CustomerContentLookupRequest();
    }

    /**
     * Create an instance of {@link CartItems }
     * 
     */
    public CartItems createCartItems() {
        return new CartItems();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link HTTPHeaders }
     * 
     */
    public HTTPHeaders createHTTPHeaders() {
        return new HTTPHeaders();
    }

    /**
     * Create an instance of {@link ResponseGroupInformation }
     * 
     */
    public ResponseGroupInformation createResponseGroupInformation() {
        return new ResponseGroupInformation();
    }

    /**
     * Create an instance of {@link CustomerContentSearchResponse }
     * 
     */
    public CustomerContentSearchResponse createCustomerContentSearchResponse() {
        return new CustomerContentSearchResponse();
    }

    /**
     * Create an instance of {@link BrowseNode }
     * 
     */
    public BrowseNode createBrowseNode() {
        return new BrowseNode();
    }

    /**
     * Create an instance of {@link VehicleSearch }
     * 
     */
    public VehicleSearch createVehicleSearch() {
        return new VehicleSearch();
    }

    /**
     * Create an instance of {@link CartAddRequest.Items.Item.MetaData }
     * 
     */
    public CartAddRequest.Items.Item.MetaData createCartAddRequestItemsItemMetaData() {
        return new CartAddRequest.Items.Item.MetaData();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link CartItem }
     * 
     */
    public CartItem createCartItem() {
        return new CartItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", name = "Condition")
    public JAXBElement<String> createCondition(String value) {
        return new JAXBElement<String>(_Condition_QNAME, String.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", name = "DeliveryMethod")
    public JAXBElement<String> createDeliveryMethod(String value) {
        return new JAXBElement<String>(_DeliveryMethod_QNAME, String.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.amazon.com/AWSECommerceService/2011-04-01", name = "AudienceRating")
    public JAXBElement<String> createAudienceRating(String value) {
        return new JAXBElement<String>(_AudienceRating_QNAME, String.class,
                null, value);
    }

}
