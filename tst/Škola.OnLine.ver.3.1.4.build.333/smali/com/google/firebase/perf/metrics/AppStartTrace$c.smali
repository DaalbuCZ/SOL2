.class public Lcom/google/firebase/perf/metrics/AppStartTrace$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/perf/metrics/AppStartTrace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/perf/metrics/AppStartTrace;


# direct methods
.method public constructor <init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace$c;->n:Lcom/google/firebase/perf/metrics/AppStartTrace;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace$c;->n:Lcom/google/firebase/perf/metrics/AppStartTrace;

    invoke-static {v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->m(Lcom/google/firebase/perf/metrics/AppStartTrace;)Lf7/l;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace$c;->n:Lcom/google/firebase/perf/metrics/AppStartTrace;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->n(Lcom/google/firebase/perf/metrics/AppStartTrace;Z)Z

    :cond_0
    return-void
.end method
