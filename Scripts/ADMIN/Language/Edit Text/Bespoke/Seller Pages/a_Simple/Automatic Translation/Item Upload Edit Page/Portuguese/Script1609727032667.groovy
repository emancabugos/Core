import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Add_Edit Item Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'), 
    'value', 'SEUS ARTIGOS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Fill in your item details here_item_details'), 
    'value', 'Preencha os detalhes do item aqui', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'), 
    'value', 'Categoria', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'), 
    'value', 'Selecione uma categoria', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'), 
    'value', 'Nome do item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'), 
    'value', 'Preço', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'), 
    'value', 'Selecionar tudo', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'), 
    'value', 'Selecione nenhum', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'), 
    'value', 'descrição do item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'), 
    'value', 'IMAGEM DA CAPA DO ARTIGO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_details'), 
    'value', 'Máximo de 5 imagens devem estar na proporção de 1: 1 e não mais de 2 MB (Recomendado 600px X 600px)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'), 
    'value', 'SQUEAKY TOY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'), 
    'value', 'Quantidade', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'), 
    'value', 'Estoque ilimitado', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'), 
    'value', 'SIM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'), 
    'value', 'NÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variants_variants'), 
    'value', 'Variantes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'), 
    'value', 'Variante (s)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'), 
    'value', 'Adicione até 3 opções diferentes disponíveis para o item, e, g. Cor, tamanho e material', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Change_variants-change'), 
    'value', 'mudança', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'), 
    'value', 'OK', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'), 
    'value', 'Cancelar', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'), 
    'value', 'Adicionar variantes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'), 
    'value', 'OPÇÕES DE VARIANTES', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS CHOICES_option_choices'), 
    'value', 'ESCOLHAS DE VARIANTES', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'), 
    'value', 'Por exemplo, cor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'), 
    'value', 'Eg vermelho', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Color_place_colour'), 
    'value', 'Cor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Red_place_option'), 
    'value', 'Vermelho', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'), 
    'value', 'Imagem', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'), 
    'value', 'Mesma imagem', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'), 
    'value', 'Sobretaxa', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'), 
    'value', 'Preço total', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'), 
    'value', 'estoque', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited_tbl_lbe_unlimited'), 
    'value', 'Ilimitado', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'), 
    'value', 'OPÇÕES DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', 'Defina o que os serviços de entrega utilizados e a sobretaxa para cada opção. (Selecione pelo menos uma opção de entrega ou local de retirada))', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', 'Oferecer custos de transporte reduzidos aos compradores quando eles compram mais de um item de você!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'), 
    'value', 'Entrega total = entrega de item único (mais alta de A) recarga individual com outro item (B para cada item)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'), 
    'value', 'SERVIÇO DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'), 
    'value', 'ENTREGA DO ÚNICO ITEM (A)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'), 
    'value', 'APLICAÇÃO ÚNICA (A)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'), 
    'value', 'COM OUTRO ARTIGO (B)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'), 
    'value', 'ADICIONAR NOVO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'), 
    'value', 'LOCALIZAÇÃO PICK-UP', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'), 
    'value', 'Defina o endereço completo de onde o comprador pode retirar (Você deve ter pelo menos uma opção de entrega ou um local de picking selecionado).', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICKUP LOCATION ADDRESS_location_address'), 
    'value', 'ENDEREÇO ​​DE LOCALIZAÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'), 
    'value', 'ADICIONAR NOVO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'), 
    'value', 'SALVE ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'), 
    'value', 'Itens salvos!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'), 
    'value', 'Este item foi salvo em', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'), 
    'value', 'O idioma padrão das páginas do comprador é', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'), 
    'value', 'Recomendamos que você, pelo menos, adicione uma tradução nesse idioma!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'), 
    'value', 'Eu vou fazer isso mais tarde!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'), 
    'value', 'Adicionar traduções', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'), 
    'value', 'Editar Traduções', 0)

