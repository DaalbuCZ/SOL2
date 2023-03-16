.class public final Lv6/h;
.super Lcom/google/firebase/perf/application/b;
.source ""

# interfaces
.implements Ly6/b;


# static fields
.field private static final v:Lu6/a;


# instance fields
.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lcom/google/firebase/perf/session/gauges/GaugeManager;

.field private final p:Lz6/k;

.field private final q:Lb7/h$b;

.field private final r:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ly6/b;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/String;

.field private t:Z

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lu6/a;->e()Lu6/a;

    move-result-object v0

    sput-object v0, Lv6/h;->v:Lu6/a;

    return-void
.end method

.method private constructor <init>(Lz6/k;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lv6/h;-><init>(Lz6/k;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V

    return-void
.end method

.method public constructor <init>(Lz6/k;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/firebase/perf/application/b;-><init>(Lcom/google/firebase/perf/application/a;)V

    invoke-static {}, Lb7/h;->F0()Lb7/h$b;

    move-result-object p2

    iput-object p2, p0, Lv6/h;->q:Lb7/h$b;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lv6/h;->r:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lv6/h;->p:Lz6/k;

    iput-object p3, p0, Lv6/h;->o:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv6/h;->n:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->registerForAppState()V

    return-void
.end method

.method public static c(Lz6/k;)Lv6/h;
    .locals 1

    new-instance v0, Lv6/h;

    invoke-direct {v0, p0}, Lv6/h;-><init>(Lz6/k;)V

    return-object v0
.end method

.method private j()Z
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->Q()Z

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->S()Z

    move-result v0

    return v0
.end method

.method private static m(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x80

    if-le v0, v2, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x1f

    if-le v2, v3, :cond_2

    const/16 v3, 0x7f

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public A(Ljava/lang/String;)Lv6/h;
    .locals 0

    iput-object p1, p0, Lv6/h;->s:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ly6/a;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lv6/h;->v:Lu6/a;

    const-string v0, "Unable to add new SessionId to the Network Trace. Continuing without it."

    invoke-virtual {p1, v0}, Lu6/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lv6/h;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lv6/h;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lv6/h;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public b()Lb7/h;
    .locals 3

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    iget-object v1, p0, Lv6/h;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/session/SessionManager;->unregisterForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->unregisterForAppState()V

    invoke-virtual {p0}, Lv6/h;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ly6/a;->b(Ljava/util/List;)[Lb7/k;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lv6/h;->q:Lb7/h$b;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lb7/h$b;->L(Ljava/lang/Iterable;)Lb7/h$b;

    :cond_0
    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v0

    check-cast v0, Lb7/h;

    iget-object v1, p0, Lv6/h;->s:Ljava/lang/String;

    invoke-static {v1}, Lx6/e;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lv6/h;->v:Lu6/a;

    const-string v2, "Dropping network request from a \'User-Agent\' that is not allowed"

    invoke-virtual {v1, v2}, Lu6/a;->a(Ljava/lang/String;)V

    return-object v0

    :cond_1
    iget-boolean v1, p0, Lv6/h;->t:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lv6/h;->p:Lz6/k;

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->getAppState()Lb7/d;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lz6/k;->B(Lb7/h;Lb7/d;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lv6/h;->t:Z

    return-object v0

    :cond_2
    iget-boolean v1, p0, Lv6/h;->u:Z

    if-eqz v1, :cond_3

    sget-object v1, Lv6/h;->v:Lu6/a;

    const-string v2, "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response"

    invoke-virtual {v1, v2}, Lu6/a;->a(Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly6/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv6/h;->n:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lv6/h;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly6/a;

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->R()Z

    move-result v0

    return v0
.end method

.method public n(Ljava/util/Map;)Lv6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lv6/h;"
        }
    .end annotation

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0}, Lb7/h$b;->M()Lb7/h$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb7/h$b;->T(Ljava/util/Map;)Lb7/h$b;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lv6/h;
    .locals 3

    if-eqz p1, :cond_9

    sget-object v0, Lb7/h$d;->o:Lb7/h$d;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "DELETE"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v2, "CONNECT"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_2
    const-string v2, "TRACE"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_3
    const-string v2, "PATCH"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_4
    const-string v2, "POST"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_5
    const-string v2, "HEAD"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_6
    const-string v2, "PUT"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_7
    const-string v2, "GET"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_8
    const-string v2, "OPTIONS"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v0, Lb7/h$d;->s:Lb7/h$d;

    goto :goto_1

    :pswitch_1
    sget-object v0, Lb7/h$d;->x:Lb7/h$d;

    goto :goto_1

    :pswitch_2
    sget-object v0, Lb7/h$d;->w:Lb7/h$d;

    goto :goto_1

    :pswitch_3
    sget-object v0, Lb7/h$d;->u:Lb7/h$d;

    goto :goto_1

    :pswitch_4
    sget-object v0, Lb7/h$d;->r:Lb7/h$d;

    goto :goto_1

    :pswitch_5
    sget-object v0, Lb7/h$d;->t:Lb7/h$d;

    goto :goto_1

    :pswitch_6
    sget-object v0, Lb7/h$d;->q:Lb7/h$d;

    goto :goto_1

    :pswitch_7
    sget-object v0, Lb7/h$d;->p:Lb7/h$d;

    goto :goto_1

    :pswitch_8
    sget-object v0, Lb7/h$d;->v:Lb7/h$d;

    :goto_1
    iget-object p1, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {p1, v0}, Lb7/h$b;->V(Lb7/h$d;)Lb7/h$b;

    :cond_9
    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x1faded82 -> :sswitch_8
        0x11336 -> :sswitch_7
        0x136ef -> :sswitch_6
        0x21c5e0 -> :sswitch_5
        0x2590a0 -> :sswitch_4
        0x4862828 -> :sswitch_3
        0x4c5f925 -> :sswitch_2
        0x638004ca -> :sswitch_1
        0x77f979ab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(I)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1}, Lb7/h$b;->W(I)Lb7/h$b;

    return-object p0
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv6/h;->u:Z

    return-void
.end method

.method public r()Lv6/h;
    .locals 2

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    sget-object v1, Lb7/h$e;->p:Lb7/h$e;

    invoke-virtual {v0, v1}, Lb7/h$b;->X(Lb7/h$e;)Lb7/h$b;

    return-object p0
.end method

.method public s(J)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1, p2}, Lb7/h$b;->Y(J)Lb7/h$b;

    return-object p0
.end method

.method public t(J)Lv6/h;
    .locals 3

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ly6/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    iget-object v2, p0, Lv6/h;->r:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, v2}, Lcom/google/firebase/perf/session/SessionManager;->registerForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    iget-object v1, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v1, p1, p2}, Lb7/h$b;->U(J)Lb7/h$b;

    invoke-virtual {p0, v0}, Lv6/h;->a(Ly6/a;)V

    invoke-virtual {v0}, Ly6/a;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv6/h;->o:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-virtual {v0}, Ly6/a;->d()La7/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(La7/l;)V

    :cond_0
    return-object p0
.end method

.method public u(Ljava/lang/String;)Lv6/h;
    .locals 3

    if-nez p1, :cond_0

    iget-object p1, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {p1}, Lb7/h$b;->N()Lb7/h$b;

    return-object p0

    :cond_0
    invoke-static {p1}, Lv6/h;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1}, Lb7/h$b;->Z(Ljava/lang/String;)Lb7/h$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lv6/h;->v:Lu6/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The content type of the response is not a valid content-type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu6/a;->j(Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method public v(J)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1, p2}, Lb7/h$b;->a0(J)Lb7/h$b;

    return-object p0
.end method

.method public w(J)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1, p2}, Lb7/h$b;->b0(J)Lb7/h$b;

    return-object p0
.end method

.method public x(J)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1, p2}, Lb7/h$b;->c0(J)Lb7/h$b;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ly6/a;

    move-result-object p1

    invoke-virtual {p1}, Ly6/a;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv6/h;->o:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ly6/a;

    move-result-object p2

    invoke-virtual {p2}, Ly6/a;->d()La7/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(La7/l;)V

    :cond_0
    return-object p0
.end method

.method public y(J)Lv6/h;
    .locals 1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    invoke-virtual {v0, p1, p2}, Lb7/h$b;->d0(J)Lb7/h$b;

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lv6/h;
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, La7/o;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lv6/h;->q:Lb7/h$b;

    const/16 v1, 0x7d0

    invoke-static {p1, v1}, La7/o;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb7/h$b;->e0(Ljava/lang/String;)Lb7/h$b;

    :cond_0
    return-object p0
.end method
