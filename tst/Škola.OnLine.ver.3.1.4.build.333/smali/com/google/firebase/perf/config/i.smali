.class public final Lcom/google/firebase/perf/config/i;
.super Lcom/google/firebase/perf/config/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/perf/config/v<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# static fields
.field private static a:Lcom/google/firebase/perf/config/i;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/perf/config/v;-><init>()V

    return-void
.end method

.method protected static declared-synchronized e()Lcom/google/firebase/perf/config/i;
    .locals 2

    const-class v0, Lcom/google/firebase/perf/config/i;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/perf/config/i;->a:Lcom/google/firebase/perf/config/i;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/firebase/perf/config/i;

    invoke-direct {v1}, Lcom/google/firebase/perf/config/i;-><init>()V

    sput-object v1, Lcom/google/firebase/perf/config/i;->a:Lcom/google/firebase/perf/config/i;

    :cond_0
    sget-object v1, Lcom/google/firebase/perf/config/i;->a:Lcom/google/firebase/perf/config/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.firebase.perf.NetworkRequestSamplingRate"

    return-object v0
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "fpr_vc_network_request_sampling_rate"

    return-object v0
.end method

.method protected d()Ljava/lang/Float;
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
