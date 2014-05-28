/**
 * Copyright (C) 2009-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.model.japi;

import akka.http.model.MediaTypes$;
import akka.japi.Option;

import java.util.Map;

/**
 * Contains the set of predefined media-types.
 */
public abstract class MediaTypes {
    public static final MediaType application_atom_xml = akka.http.model.MediaTypes.application$divatom$plusxml();
    public static final MediaType application_base64 = akka.http.model.MediaTypes.application$divbase64();
    public static final MediaType application_excel = akka.http.model.MediaTypes.application$divexcel();
    public static final MediaType application_font_woff = akka.http.model.MediaTypes.application$divfont$minuswoff();
    public static final MediaType application_gnutar = akka.http.model.MediaTypes.application$divgnutar();
    public static final MediaType application_java_archive = akka.http.model.MediaTypes.application$divjava$minusarchive();
    public static final MediaType application_javascript = akka.http.model.MediaTypes.application$divjavascript();
    public static final MediaType application_json = akka.http.model.MediaTypes.application$divjson();
    public static final MediaType application_json_patch_json = akka.http.model.MediaTypes.application$divjson$minuspatch$plusjson();
    public static final MediaType application_lha = akka.http.model.MediaTypes.application$divlha();
    public static final MediaType application_lzx = akka.http.model.MediaTypes.application$divlzx();
    public static final MediaType application_mspowerpoint = akka.http.model.MediaTypes.application$divmspowerpoint();
    public static final MediaType application_msword = akka.http.model.MediaTypes.application$divmsword();
    public static final MediaType application_octet_stream = akka.http.model.MediaTypes.application$divoctet$minusstream();
    public static final MediaType application_pdf = akka.http.model.MediaTypes.application$divpdf();
    public static final MediaType application_postscript = akka.http.model.MediaTypes.application$divpostscript();
    public static final MediaType application_rss_xml = akka.http.model.MediaTypes.application$divrss$plusxml();
    public static final MediaType application_soap_xml = akka.http.model.MediaTypes.application$divsoap$plusxml();
    public static final MediaType application_vnd_api_json = akka.http.model.MediaTypes.application$divvnd$u002Eapi$plusjson();
    public static final MediaType application_vnd_google_earth_kml_xml = akka.http.model.MediaTypes.application$divvnd$u002Egoogle$minusearth$u002Ekml$plusxml();
    public static final MediaType application_vnd_google_earth_kmz = akka.http.model.MediaTypes.application$divvnd$u002Egoogle$minusearth$u002Ekmz();
    public static final MediaType application_vnd_ms_fontobject = akka.http.model.MediaTypes.application$divvnd$u002Ems$minusfontobject();
    public static final MediaType application_vnd_oasis_opendocument_chart = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Echart();
    public static final MediaType application_vnd_oasis_opendocument_database = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Edatabase();
    public static final MediaType application_vnd_oasis_opendocument_formula = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Eformula();
    public static final MediaType application_vnd_oasis_opendocument_graphics = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Egraphics();
    public static final MediaType application_vnd_oasis_opendocument_image = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Eimage();
    public static final MediaType application_vnd_oasis_opendocument_presentation = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Epresentation();
    public static final MediaType application_vnd_oasis_opendocument_spreadsheet = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Espreadsheet();
    public static final MediaType application_vnd_oasis_opendocument_text = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Etext();
    public static final MediaType application_vnd_oasis_opendocument_text_master = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Etext$minusmaster();
    public static final MediaType application_vnd_oasis_opendocument_text_web = akka.http.model.MediaTypes.application$divvnd$u002Eoasis$u002Eopendocument$u002Etext$minusweb();
    public static final MediaType application_vnd_openxmlformats_officedocument_presentationml_presentation = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Epresentationml$u002Epresentation();
    public static final MediaType application_vnd_openxmlformats_officedocument_presentationml_slide = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Epresentationml$u002Eslide();
    public static final MediaType application_vnd_openxmlformats_officedocument_presentationml_slideshow = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Epresentationml$u002Eslideshow();
    public static final MediaType application_vnd_openxmlformats_officedocument_presentationml_template = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Epresentationml$u002Etemplate();
    public static final MediaType application_vnd_openxmlformats_officedocument_spreadsheetml_sheet = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Espreadsheetml$u002Esheet();
    public static final MediaType application_vnd_openxmlformats_officedocument_spreadsheetml_template = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Espreadsheetml$u002Etemplate();
    public static final MediaType application_vnd_openxmlformats_officedocument_wordprocessingml_document = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Ewordprocessingml$u002Edocument();
    public static final MediaType application_vnd_openxmlformats_officedocument_wordprocessingml_template = akka.http.model.MediaTypes.application$divvnd$u002Eopenxmlformats$minusofficedocument$u002Ewordprocessingml$u002Etemplate();
    public static final MediaType application_x_7z_compressed = akka.http.model.MediaTypes.application$divx$minus7z$minuscompressed();
    public static final MediaType application_x_ace_compressed = akka.http.model.MediaTypes.application$divx$minusace$minuscompressed();
    public static final MediaType application_x_apple_diskimage = akka.http.model.MediaTypes.application$divx$minusapple$minusdiskimage();
    public static final MediaType application_x_arc_compressed = akka.http.model.MediaTypes.application$divx$minusarc$minuscompressed();
    public static final MediaType application_x_bzip = akka.http.model.MediaTypes.application$divx$minusbzip();
    public static final MediaType application_x_bzip2 = akka.http.model.MediaTypes.application$divx$minusbzip2();
    public static final MediaType application_x_chrome_extension = akka.http.model.MediaTypes.application$divx$minuschrome$minusextension();
    public static final MediaType application_x_compress = akka.http.model.MediaTypes.application$divx$minuscompress();
    public static final MediaType application_x_compressed = akka.http.model.MediaTypes.application$divx$minuscompressed();
    public static final MediaType application_x_debian_package = akka.http.model.MediaTypes.application$divx$minusdebian$minuspackage();
    public static final MediaType application_x_dvi = akka.http.model.MediaTypes.application$divx$minusdvi();
    public static final MediaType application_x_font_truetype = akka.http.model.MediaTypes.application$divx$minusfont$minustruetype();
    public static final MediaType application_x_font_opentype = akka.http.model.MediaTypes.application$divx$minusfont$minusopentype();
    public static final MediaType application_x_gtar = akka.http.model.MediaTypes.application$divx$minusgtar();
    public static final MediaType application_x_gzip = akka.http.model.MediaTypes.application$divx$minusgzip();
    public static final MediaType application_x_latex = akka.http.model.MediaTypes.application$divx$minuslatex();
    public static final MediaType application_x_rar_compressed = akka.http.model.MediaTypes.application$divx$minusrar$minuscompressed();
    public static final MediaType application_x_redhat_package_manager = akka.http.model.MediaTypes.application$divx$minusredhat$minuspackage$minusmanager();
    public static final MediaType application_x_shockwave_flash = akka.http.model.MediaTypes.application$divx$minusshockwave$minusflash();
    public static final MediaType application_x_tar = akka.http.model.MediaTypes.application$divx$minustar();
    public static final MediaType application_x_tex = akka.http.model.MediaTypes.application$divx$minustex();
    public static final MediaType application_x_texinfo = akka.http.model.MediaTypes.application$divx$minustexinfo();
    public static final MediaType application_x_vrml = akka.http.model.MediaTypes.application$divx$minusvrml();
    public static final MediaType application_x_www_form_urlencoded = akka.http.model.MediaTypes.application$divx$minuswww$minusform$minusurlencoded();
    public static final MediaType application_x_x509_ca_cert = akka.http.model.MediaTypes.application$divx$minusx509$minusca$minuscert();
    public static final MediaType application_x_xpinstall = akka.http.model.MediaTypes.application$divx$minusxpinstall();
    public static final MediaType application_xhtml_xml = akka.http.model.MediaTypes.application$divxhtml$plusxml();
    public static final MediaType application_xml_dtd = akka.http.model.MediaTypes.application$divxml$minusdtd();
    public static final MediaType application_xml = akka.http.model.MediaTypes.application$divxml();
    public static final MediaType application_zip = akka.http.model.MediaTypes.application$divzip();
    public static final MediaType audio_aiff = akka.http.model.MediaTypes.audio$divaiff();
    public static final MediaType audio_basic = akka.http.model.MediaTypes.audio$divbasic();
    public static final MediaType audio_midi = akka.http.model.MediaTypes.audio$divmidi();
    public static final MediaType audio_mod = akka.http.model.MediaTypes.audio$divmod();
    public static final MediaType audio_mpeg = akka.http.model.MediaTypes.audio$divmpeg();
    public static final MediaType audio_ogg = akka.http.model.MediaTypes.audio$divogg();
    public static final MediaType audio_voc = akka.http.model.MediaTypes.audio$divvoc();
    public static final MediaType audio_vorbis = akka.http.model.MediaTypes.audio$divvorbis();
    public static final MediaType audio_voxware = akka.http.model.MediaTypes.audio$divvoxware();
    public static final MediaType audio_wav = akka.http.model.MediaTypes.audio$divwav();
    public static final MediaType audio_x_realaudio = akka.http.model.MediaTypes.audio$divx$minusrealaudio();
    public static final MediaType audio_x_psid = akka.http.model.MediaTypes.audio$divx$minuspsid();
    public static final MediaType audio_xm = akka.http.model.MediaTypes.audio$divxm();
    public static final MediaType audio_webm = akka.http.model.MediaTypes.audio$divwebm();
    public static final MediaType image_gif = akka.http.model.MediaTypes.image$divgif();
    public static final MediaType image_jpeg = akka.http.model.MediaTypes.image$divjpeg();
    public static final MediaType image_pict = akka.http.model.MediaTypes.image$divpict();
    public static final MediaType image_png = akka.http.model.MediaTypes.image$divpng();
    public static final MediaType image_svg_xml = akka.http.model.MediaTypes.image$divsvg$plusxml();
    public static final MediaType image_tiff = akka.http.model.MediaTypes.image$divtiff();
    public static final MediaType image_x_icon = akka.http.model.MediaTypes.image$divx$minusicon();
    public static final MediaType image_x_ms_bmp = akka.http.model.MediaTypes.image$divx$minusms$minusbmp();
    public static final MediaType image_x_pcx = akka.http.model.MediaTypes.image$divx$minuspcx();
    public static final MediaType image_x_pict = akka.http.model.MediaTypes.image$divx$minuspict();
    public static final MediaType image_x_quicktime = akka.http.model.MediaTypes.image$divx$minusquicktime();
    public static final MediaType image_x_rgb = akka.http.model.MediaTypes.image$divx$minusrgb();
    public static final MediaType image_x_xbitmap = akka.http.model.MediaTypes.image$divx$minusxbitmap();
    public static final MediaType image_x_xpixmap = akka.http.model.MediaTypes.image$divx$minusxpixmap();
    public static final MediaType image_webp = akka.http.model.MediaTypes.image$divwebp();
    public static final MediaType message_http = akka.http.model.MediaTypes.message$divhttp();
    public static final MediaType message_delivery_status = akka.http.model.MediaTypes.message$divdelivery$minusstatus();
    public static final MediaType message_rfc822 = akka.http.model.MediaTypes.message$divrfc822();
    public static final MediaType multipart_mixed = akka.http.model.MediaTypes.multipart$divmixed();
    public static final MediaType multipart_alternative = akka.http.model.MediaTypes.multipart$divalternative();
    public static final MediaType multipart_related = akka.http.model.MediaTypes.multipart$divrelated();
    public static final MediaType multipart_form_data = akka.http.model.MediaTypes.multipart$divform$minusdata();
    public static final MediaType multipart_signed = akka.http.model.MediaTypes.multipart$divsigned();
    public static final MediaType multipart_encrypted = akka.http.model.MediaTypes.multipart$divencrypted();
    public static final MediaType multipart_byteranges = akka.http.model.MediaTypes.multipart$divbyteranges();
    public static final MediaType text_asp = akka.http.model.MediaTypes.text$divasp();
    public static final MediaType text_cache_manifest = akka.http.model.MediaTypes.text$divcache$minusmanifest();
    public static final MediaType text_calendar = akka.http.model.MediaTypes.text$divcalendar();
    public static final MediaType text_css = akka.http.model.MediaTypes.text$divcss();
    public static final MediaType text_csv = akka.http.model.MediaTypes.text$divcsv();
    public static final MediaType text_html = akka.http.model.MediaTypes.text$divhtml();
    public static final MediaType text_mcf = akka.http.model.MediaTypes.text$divmcf();
    public static final MediaType text_plain = akka.http.model.MediaTypes.text$divplain();
    public static final MediaType text_richtext = akka.http.model.MediaTypes.text$divrichtext();
    public static final MediaType text_tab_separated_values = akka.http.model.MediaTypes.text$divtab$minusseparated$minusvalues();
    public static final MediaType text_uri_list = akka.http.model.MediaTypes.text$divuri$minuslist();
    public static final MediaType text_vnd_wap_wml = akka.http.model.MediaTypes.text$divvnd$u002Ewap$u002Ewml();
    public static final MediaType text_vnd_wap_wmlscript = akka.http.model.MediaTypes.text$divvnd$u002Ewap$u002Ewmlscript();
    public static final MediaType text_x_asm = akka.http.model.MediaTypes.text$divx$minusasm();
    public static final MediaType text_x_c = akka.http.model.MediaTypes.text$divx$minusc();
    public static final MediaType text_x_component = akka.http.model.MediaTypes.text$divx$minuscomponent();
    public static final MediaType text_x_h = akka.http.model.MediaTypes.text$divx$minush();
    public static final MediaType text_x_java_source = akka.http.model.MediaTypes.text$divx$minusjava$minussource();
    public static final MediaType text_x_pascal = akka.http.model.MediaTypes.text$divx$minuspascal();
    public static final MediaType text_x_script = akka.http.model.MediaTypes.text$divx$minusscript();
    public static final MediaType text_x_scriptcsh = akka.http.model.MediaTypes.text$divx$minusscriptcsh();
    public static final MediaType text_x_scriptelisp = akka.http.model.MediaTypes.text$divx$minusscriptelisp();
    public static final MediaType text_x_scriptksh = akka.http.model.MediaTypes.text$divx$minusscriptksh();
    public static final MediaType text_x_scriptlisp = akka.http.model.MediaTypes.text$divx$minusscriptlisp();
    public static final MediaType text_x_scriptperl = akka.http.model.MediaTypes.text$divx$minusscriptperl();
    public static final MediaType text_x_scriptperl_module = akka.http.model.MediaTypes.text$divx$minusscriptperl$minusmodule();
    public static final MediaType text_x_scriptphyton = akka.http.model.MediaTypes.text$divx$minusscriptphyton();
    public static final MediaType text_x_scriptrexx = akka.http.model.MediaTypes.text$divx$minusscriptrexx();
    public static final MediaType text_x_scriptscheme = akka.http.model.MediaTypes.text$divx$minusscriptscheme();
    public static final MediaType text_x_scriptsh = akka.http.model.MediaTypes.text$divx$minusscriptsh();
    public static final MediaType text_x_scripttcl = akka.http.model.MediaTypes.text$divx$minusscripttcl();
    public static final MediaType text_x_scripttcsh = akka.http.model.MediaTypes.text$divx$minusscripttcsh();
    public static final MediaType text_x_scriptzsh = akka.http.model.MediaTypes.text$divx$minusscriptzsh();
    public static final MediaType text_x_server_parsed_html = akka.http.model.MediaTypes.text$divx$minusserver$minusparsed$minushtml();
    public static final MediaType text_x_setext = akka.http.model.MediaTypes.text$divx$minussetext();
    public static final MediaType text_x_sgml = akka.http.model.MediaTypes.text$divx$minussgml();
    public static final MediaType text_x_speech = akka.http.model.MediaTypes.text$divx$minusspeech();
    public static final MediaType text_x_uuencode = akka.http.model.MediaTypes.text$divx$minusuuencode();
    public static final MediaType text_x_vcalendar = akka.http.model.MediaTypes.text$divx$minusvcalendar();
    public static final MediaType text_x_vcard = akka.http.model.MediaTypes.text$divx$minusvcard();
    public static final MediaType text_xml = akka.http.model.MediaTypes.text$divxml();
    public static final MediaType video_avs_video = akka.http.model.MediaTypes.video$divavs$minusvideo();
    public static final MediaType video_divx = akka.http.model.MediaTypes.video$divdivx();
    public static final MediaType video_gl = akka.http.model.MediaTypes.video$divgl();
    public static final MediaType video_mp4 = akka.http.model.MediaTypes.video$divmp4();
    public static final MediaType video_mpeg = akka.http.model.MediaTypes.video$divmpeg();
    public static final MediaType video_ogg = akka.http.model.MediaTypes.video$divogg();
    public static final MediaType video_quicktime = akka.http.model.MediaTypes.video$divquicktime();
    public static final MediaType video_x_dv = akka.http.model.MediaTypes.video$divx$minusdv();
    public static final MediaType video_x_flv = akka.http.model.MediaTypes.video$divx$minusflv();
    public static final MediaType video_x_motion_jpeg = akka.http.model.MediaTypes.video$divx$minusmotion$minusjpeg();
    public static final MediaType video_x_ms_asf = akka.http.model.MediaTypes.video$divx$minusms$minusasf();
    public static final MediaType video_x_msvideo = akka.http.model.MediaTypes.video$divx$minusmsvideo();
    public static final MediaType video_x_sgi_movie = akka.http.model.MediaTypes.video$divx$minussgi$minusmovie();
    public static final MediaType video_webm = akka.http.model.MediaTypes.video$divwebm();

    /**
     * Register a custom media type.
     */
    public static MediaType registerCustom(
            String mainType,
            String subType,
            boolean compressible,
            boolean binary,
            Iterable<String> fileExtensions,
            Map<String, String> parameters) {
        return akka.http.model.MediaTypes.register(akka.http.model.MediaType.custom(mainType, subType, compressible, binary, Util.convertIterable(fileExtensions), Util.convertMapToScala(parameters), false));
    }

    /**
     * Looks up a media-type with the given main-type and sub-type.
     */
    public static Option<MediaType> lookup(String mainType, String subType) {
        return Util.lookupInRegistry(MediaTypes$.MODULE$, new scala.Tuple2<String, String>(mainType, subType));
    }
}
