.class public final synthetic Lcom/google/firebase/perf/session/gauges/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/b;


# static fields
.field public static final synthetic a:Lcom/google/firebase/perf/session/gauges/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/perf/session/gauges/h;

    invoke-direct {v0}, Lcom/google/firebase/perf/session/gauges/h;-><init>()V

    sput-object v0, Lcom/google/firebase/perf/session/gauges/h;->a:Lcom/google/firebase/perf/session/gauges/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
