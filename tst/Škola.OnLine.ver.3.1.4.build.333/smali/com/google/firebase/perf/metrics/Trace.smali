.class public Lcom/google/firebase/perf/metrics/Trace;
.super Lcom/google/firebase/perf/application/b;
.source ""

# interfaces
.implements Landroid/os/Parcelable;
.implements Ld7/b;


# static fields
.field private static final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation
.end field

.field static final B:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Lz6/a;


# instance fields
.field private final n:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ld7/b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lcom/google/firebase/perf/metrics/Trace;

.field private final p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/perf/metrics/a;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/a;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Le7/k;

.field private final w:Lf7/a;

.field private x:Lf7/l;

.field private y:Lf7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz6/a;->e()Lz6/a;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/perf/metrics/Trace;->A:Ljava/util/Map;

    new-instance v0, Lcom/google/firebase/perf/metrics/Trace$a;

    invoke-direct {v0}, Lcom/google/firebase/perf/metrics/Trace$a;-><init>()V

    sput-object v0, Lcom/google/firebase/perf/metrics/Trace;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/firebase/perf/metrics/Trace$b;

    invoke-direct {v0}, Lcom/google/firebase/perf/metrics/Trace$b;-><init>()V

    sput-object v0, Lcom/google/firebase/perf/metrics/Trace;->B:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v1

    :goto_0
    invoke-direct {p0, v1}, Lcom/google/firebase/perf/application/b;-><init>(Lcom/google/firebase/perf/application/a;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->n:Ljava/lang/ref/WeakReference;

    const-class v1, Lcom/google/firebase/perf/metrics/Trace;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->o:Lcom/google/firebase/perf/metrics/Trace;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    const-class v2, Lcom/google/firebase/perf/metrics/Trace;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    new-instance v2, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v2, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    const-class v2, Lcom/google/firebase/perf/metrics/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    const-class v1, Lf7/l;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    const-class v1, Lf7/l;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    const-class v2, Ld7/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    if-eqz p2, :cond_1

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->v:Le7/k;

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->w:Lf7/a;

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    goto :goto_1

    :cond_1
    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->v:Le7/k;

    new-instance p1, Lf7/a;

    invoke-direct {p1}, Lf7/a;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->w:Lf7/a;

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    :goto_1
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;ZLcom/google/firebase/perf/metrics/Trace$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Landroid/os/Parcel;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v2

    new-instance v3, Lf7/a;

    invoke-direct {v3}, Lf7/a;-><init>()V

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v4

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Ljava/lang/String;Le7/k;Lf7/a;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Le7/k;Lf7/a;Lcom/google/firebase/perf/application/a;)V
    .locals 6

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Ljava/lang/String;Le7/k;Lf7/a;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Le7/k;Lf7/a;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V
    .locals 0

    invoke-direct {p0, p4}, Lcom/google/firebase/perf/application/b;-><init>(Lcom/google/firebase/perf/application/a;)V

    new-instance p4, Ljava/lang/ref/WeakReference;

    invoke-direct {p4, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p4, p0, Lcom/google/firebase/perf/metrics/Trace;->n:Ljava/lang/ref/WeakReference;

    const/4 p4, 0x0

    iput-object p4, p0, Lcom/google/firebase/perf/metrics/Trace;->o:Lcom/google/firebase/perf/metrics/Trace;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/firebase/perf/metrics/Trace;->w:Lf7/a;

    iput-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->v:Le7/k;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    iput-object p5, p0, Lcom/google/firebase/perf/metrics/Trace;->p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v3, 0x5

    if-ge v0, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "Exceeds max limit of number of attributes - %d"

    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1, p2}, Lb7/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v0, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "Trace \'%s\' has been stopped"

    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;
    .locals 1

    new-instance v0, Lcom/google/firebase/perf/metrics/Trace;

    invoke-direct {v0, p0}, Lcom/google/firebase/perf/metrics/Trace;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private p(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/a;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/perf/metrics/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/perf/metrics/a;

    invoke-direct {v0, p1}, Lcom/google/firebase/perf/metrics/a;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private q(Lf7/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/perf/metrics/Trace;

    iget-object v1, v0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    if-nez v1, :cond_1

    iput-object p1, v0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Ld7/a;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v0, "Unable to add new SessionId to the Trace. Continuing without it."

    invoke-virtual {p1, v0}, Lz6/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/perf/metrics/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    return-object v0
.end method

.method public describeContents()I
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method e()Lf7/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    return-object v0
.end method

.method protected finalize()V
    .locals 6

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v1, "Trace \'%s\' is started but not stopped when it is destructed!"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v3}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/google/firebase/perf/application/b;->incrementTsnsCount(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public getLongMetric(Ljava/lang/String;)J
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/perf/metrics/a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/firebase/perf/metrics/a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method i()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld7/a;

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

.method public incrementMetric(Ljava/lang/String;J)V
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {p1}, Lb7/e;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    aput-object v0, p3, v1

    const-string p1, "Cannot increment metric \'%s\'. Metric name is invalid.(%s)"

    invoke-virtual {p2, p1, p3}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->m()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, p3, v1

    const-string p1, "Cannot increment metric \'%s\' for trace \'%s\' because it\'s not started"

    invoke-virtual {p2, p1, p3}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, p3, v1

    const-string p1, "Cannot increment metric \'%s\' for trace \'%s\' because it\'s been stopped"

    invoke-virtual {p2, p1, p3}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/Trace;->p(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/a;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/firebase/perf/metrics/a;->c(J)V

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    invoke-virtual {v0}, Lcom/google/firebase/perf/metrics/a;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, p3, v1

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, p3, v3

    const-string p1, "Incrementing metric \'%s\' to %d on trace \'%s\'"

    invoke-virtual {p2, p1, p3}, Lz6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method j()Lf7/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    return-object v0
.end method

.method k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    return-object v0
.end method

.method m()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method n()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method o()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public putAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/perf/metrics/Trace;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v5, "Setting attribute \'%s\' to \'%s\' on trace \'%s\'"

    new-array v6, v1, [Ljava/lang/Object;

    aput-object p1, v6, v2

    aput-object p2, v6, v3

    iget-object v7, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v7, v6, v0

    invoke-virtual {v4, v5, v6}, Lz6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v3

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v5, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    aput-object p2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    const-string v0, "Can not set attribute \'%s\' with value \'%s\' (%s)"

    invoke-virtual {v5, v0, v1}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public putMetric(Ljava/lang/String;J)V
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {p1}, Lb7/e;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    aput-object v0, p3, v1

    const-string p1, "Cannot set value for metric \'%s\'. Metric name is invalid.(%s)"

    invoke-virtual {p2, p1, p3}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->m()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, p3, v1

    const-string p1, "Cannot set value for metric \'%s\' for trace \'%s\' because it\'s not started"

    invoke-virtual {p2, p1, p3}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, p3, v1

    const-string p1, "Cannot set value for metric \'%s\' for trace \'%s\' because it\'s been stopped"

    invoke-virtual {p2, p1, p3}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/Trace;->p(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/a;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/firebase/perf/metrics/a;->d(J)V

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v4, v1

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object p1, v4, v3

    const-string p1, "Setting metric \'%s\' to \'%s\' on trace \'%s\'"

    invoke-virtual {v0, p1, v4}, Lz6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public removeAttribute(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v0, "Can\'t remove a attribute from a Trace that\'s stopped."

    invoke-virtual {p1, v0}, Lz6/a;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public start()V
    .locals 6
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v1, "Trace feature is disabled."

    invoke-virtual {v0, v1}, Lz6/a;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    invoke-static {v0}, Lb7/e;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    sget-object v3, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v5, v4, v2

    aput-object v0, v4, v1

    const-string v0, "Cannot start trace \'%s\'. Trace name is invalid.(%s)"

    invoke-virtual {v3, v0, v4}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v2, "Trace \'%s\' has already started, should not start again!"

    invoke-virtual {v0, v2, v1}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->w:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->registerForAppState()V

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ld7/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/Trace;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, v2}, Lcom/google/firebase/perf/session/SessionManager;->registerForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0, v0}, Lcom/google/firebase/perf/metrics/Trace;->a(Ld7/a;)V

    invoke-virtual {v0}, Ld7/a;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-virtual {v0}, Ld7/a;->d()Lf7/l;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(Lf7/l;)V

    :cond_3
    return-void
.end method

.method public stop()V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->m()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "Trace \'%s\' has not been started so unable to stop!"

    invoke-virtual {v0, v1, v2}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "Trace \'%s\' has already stopped, should not stop again!"

    invoke-virtual {v0, v1, v2}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/session/SessionManager;->unregisterForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->unregisterForAppState()V

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->w:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->o:Lcom/google/firebase/perf/metrics/Trace;

    if-nez v1, :cond_3

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/Trace;->q(Lf7/l;)V

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->v:Le7/k;

    new-instance v1, Lcom/google/firebase/perf/metrics/b;

    invoke-direct {v1, p0}, Lcom/google/firebase/perf/metrics/b;-><init>(Lcom/google/firebase/perf/metrics/Trace;)V

    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/b;->a()Lg7/m;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->getAppState()Lg7/d;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le7/k;->C(Lg7/m;Lg7/d;)V

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ld7/a;

    move-result-object v0

    invoke-virtual {v0}, Ld7/a;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->p:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ld7/a;

    move-result-object v1

    invoke-virtual {v1}, Ld7/a;->d()Lf7/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(Lf7/l;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/firebase/perf/metrics/Trace;->z:Lz6/a;

    const-string v1, "Trace name is empty, no log is sent to server"

    invoke-virtual {v0, v1}, Lz6/a;->c(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->o:Lcom/google/firebase/perf/metrics/Trace;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->q:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->u:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->r:Ljava/util/Map;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->x:Lf7/l;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->y:Lf7/l;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/Trace;->t:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
