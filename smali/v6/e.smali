.class public final synthetic Lv6/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field public final synthetic o:Lb7/m$b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/perf/metrics/AppStartTrace;Lb7/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/e;->n:Lcom/google/firebase/perf/metrics/AppStartTrace;

    iput-object p2, p0, Lv6/e;->o:Lb7/m$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv6/e;->n:Lcom/google/firebase/perf/metrics/AppStartTrace;

    iget-object v1, p0, Lv6/e;->o:Lb7/m$b;

    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->k(Lcom/google/firebase/perf/metrics/AppStartTrace;Lb7/m$b;)V

    return-void
.end method
