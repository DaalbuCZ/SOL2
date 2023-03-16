.class public final synthetic Lcom/google/firebase/perf/session/gauges/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/perf/session/gauges/l;

.field public final synthetic o:La7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/perf/session/gauges/l;La7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/j;->n:Lcom/google/firebase/perf/session/gauges/l;

    iput-object p2, p0, Lcom/google/firebase/perf/session/gauges/j;->o:La7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/j;->n:Lcom/google/firebase/perf/session/gauges/l;

    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/j;->o:La7/l;

    invoke-static {v0, v1}, Lcom/google/firebase/perf/session/gauges/l;->a(Lcom/google/firebase/perf/session/gauges/l;La7/l;)V

    return-void
.end method
