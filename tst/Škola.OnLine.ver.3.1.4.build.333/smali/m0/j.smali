.class public Lm0/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final A:Lm0/a$b;

.field public static final B:Lm0/a$b;

.field public static final C:Lm0/a$b;

.field public static final D:Lm0/a$b;

.field public static final E:Lm0/a$b;

.field public static final F:Lm0/a$b;

.field public static final G:Lm0/a$e;

.field public static final H:Lm0/a$e;

.field public static final I:Lm0/a$h;

.field public static final J:Lm0/a$h;

.field public static final K:Lm0/a$g;

.field public static final L:Lm0/a$h;

.field public static final M:Lm0/a$d;

.field public static final N:Lm0/a$d;

.field public static final O:Lm0/a$d;

.field public static final P:Lm0/a$d;

.field public static final Q:Lm0/a$d;

.field public static final R:Lm0/a$d;

.field public static final S:Lm0/a$d;

.field public static final T:Lm0/a$d;

.field public static final U:Lm0/a$d;

.field public static final V:Lm0/a$d;

.field public static final W:Lm0/a$d;

.field public static final X:Lm0/a$d;

.field public static final a:Lm0/a$b;

.field public static final b:Lm0/a$b;

.field public static final c:Lm0/a$e;

.field public static final d:Lm0/a$c;

.field public static final e:Lm0/a$f;

.field public static final f:Lm0/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lm0/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:Lm0/a$f;

.field public static final i:Lm0/a$f;

.field public static final j:Lm0/a$f;

.field public static final k:Lm0/a$c;

.field public static final l:Lm0/a$c;

.field public static final m:Lm0/a$c;

.field public static final n:Lm0/a$c;

.field public static final o:Lm0/a$c;

.field public static final p:Lm0/a$c;

.field public static final q:Lm0/a$b;

.field public static final r:Lm0/a$b;

.field public static final s:Lm0/a$c;

.field public static final t:Lm0/a$f;

.field public static final u:Lm0/a$c;

.field public static final v:Lm0/a$b;

.field public static final w:Lm0/a$b;

.field public static final x:Lm0/a$f;

.field public static final y:Lm0/a$f;

.field public static final z:Lm0/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm0/a$b;

    const-string v1, "VISUAL_STATE_CALLBACK"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->a:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "OFF_SCREEN_PRERASTER"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->b:Lm0/a$b;

    new-instance v0, Lm0/a$e;

    const-string v1, "SAFE_BROWSING_ENABLE"

    invoke-direct {v0, v1, v1}, Lm0/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->c:Lm0/a$e;

    new-instance v0, Lm0/a$c;

    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->d:Lm0/a$c;

    new-instance v0, Lm0/a$f;

    const-string v1, "START_SAFE_BROWSING"

    invoke-direct {v0, v1, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->e:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_WHITELIST"

    invoke-direct {v0, v1, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->f:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    const-string v2, "SAFE_BROWSING_ALLOWLIST"

    invoke-direct {v0, v1, v2}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->g:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    invoke-direct {v0, v2, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->h:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    invoke-direct {v0, v2, v2}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->i:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    invoke-direct {v0, v1, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->j:Lm0/a$f;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->k:Lm0/a$c;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->l:Lm0/a$c;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->m:Lm0/a$c;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->n:Lm0/a$c;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->o:Lm0/a$c;

    new-instance v0, Lm0/a$c;

    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->p:Lm0/a$c;

    new-instance v0, Lm0/a$b;

    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->q:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "RECEIVE_HTTP_ERROR"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->r:Lm0/a$b;

    new-instance v0, Lm0/a$c;

    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->s:Lm0/a$c;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_HIT"

    invoke-direct {v0, v1, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->t:Lm0/a$f;

    new-instance v0, Lm0/a$c;

    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    invoke-direct {v0, v1, v1}, Lm0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->u:Lm0/a$c;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->v:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    invoke-direct {v0, v1, v1}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->w:Lm0/a$b;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    invoke-direct {v0, v1, v1}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->x:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    const-string v2, "SAFE_BROWSING_RESPONSE_PROCEED"

    invoke-direct {v0, v1, v2}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->y:Lm0/a$f;

    new-instance v0, Lm0/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    const-string v2, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    invoke-direct {v0, v1, v2}, Lm0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->z:Lm0/a$f;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    const-string v2, "WEB_MESSAGE_PORT_POST_MESSAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->A:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    const-string v2, "WEB_MESSAGE_PORT_CLOSE"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->B:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    const-string v2, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->C:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    const-string v2, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->D:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "POST_WEB_MESSAGE"

    const-string v2, "POST_WEB_MESSAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->E:Lm0/a$b;

    new-instance v0, Lm0/a$b;

    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    const-string v2, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->F:Lm0/a$b;

    new-instance v0, Lm0/a$e;

    const-string v1, "GET_WEB_VIEW_CLIENT"

    const-string v2, "GET_WEB_VIEW_CLIENT"

    invoke-direct {v0, v1, v2}, Lm0/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->G:Lm0/a$e;

    new-instance v0, Lm0/a$e;

    const-string v1, "GET_WEB_CHROME_CLIENT"

    const-string v2, "GET_WEB_CHROME_CLIENT"

    invoke-direct {v0, v1, v2}, Lm0/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->H:Lm0/a$e;

    new-instance v0, Lm0/a$h;

    const-string v1, "GET_WEB_VIEW_RENDERER"

    const-string v2, "GET_WEB_VIEW_RENDERER"

    invoke-direct {v0, v1, v2}, Lm0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->I:Lm0/a$h;

    new-instance v0, Lm0/a$h;

    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    const-string v2, "WEB_VIEW_RENDERER_TERMINATE"

    invoke-direct {v0, v1, v2}, Lm0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->J:Lm0/a$h;

    new-instance v0, Lm0/a$g;

    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    const-string v2, "TRACING_CONTROLLER_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->K:Lm0/a$g;

    new-instance v0, Lm0/a$h;

    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    const-string v2, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->L:Lm0/a$h;

    new-instance v0, Lm0/a$d;

    const-string v1, "PROXY_OVERRIDE"

    const-string v2, "PROXY_OVERRIDE:3"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->M:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "SUPPRESS_ERROR_PAGE"

    const-string v2, "SUPPRESS_ERROR_PAGE"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->N:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "MULTI_PROCESS"

    const-string v2, "MULTI_PROCESS_QUERY"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->O:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "FORCE_DARK"

    const-string v2, "FORCE_DARK"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->P:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "FORCE_DARK_STRATEGY"

    const-string v2, "FORCE_DARK_BEHAVIOR"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->Q:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "ALGORITHMIC_DARKENING"

    const-string v2, "ALGORITHMIC_DARKENING"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->R:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "WEB_MESSAGE_LISTENER"

    const-string v2, "WEB_MESSAGE_LISTENER"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->S:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "DOCUMENT_START_SCRIPT"

    const-string v2, "DOCUMENT_START_SCRIPT:1"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->T:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    const-string v2, "PROXY_OVERRIDE_REVERSE_BYPASS"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->U:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "GET_VARIATIONS_HEADER"

    const-string v2, "GET_VARIATIONS_HEADER"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->V:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "REQUESTED_WITH_HEADER_CONTROL"

    const-string v2, "REQUESTED_WITH_HEADER_CONTROL"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->W:Lm0/a$d;

    new-instance v0, Lm0/a$d;

    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    const-string v2, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    invoke-direct {v0, v1, v2}, Lm0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm0/j;->X:Lm0/a$d;

    return-void
.end method

.method public static a()Ljava/lang/UnsupportedOperationException;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lm0/a;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Lm0/j;->c(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm0/e;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "TT;>;)Z"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/e;

    invoke-interface {v1}, Lm0/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/e;

    invoke-interface {p1}, Lm0/e;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown feature "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
