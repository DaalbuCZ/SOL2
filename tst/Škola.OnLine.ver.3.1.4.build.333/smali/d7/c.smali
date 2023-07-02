.class public final synthetic Ld7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/perf/session/SessionManager;

.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Ld7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/perf/session/SessionManager;Landroid/content/Context;Ld7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/c;->n:Lcom/google/firebase/perf/session/SessionManager;

    iput-object p2, p0, Ld7/c;->o:Landroid/content/Context;

    iput-object p3, p0, Ld7/c;->p:Ld7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ld7/c;->n:Lcom/google/firebase/perf/session/SessionManager;

    iget-object v1, p0, Ld7/c;->o:Landroid/content/Context;

    iget-object v2, p0, Ld7/c;->p:Ld7/a;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/perf/session/SessionManager;->b(Lcom/google/firebase/perf/session/SessionManager;Landroid/content/Context;Ld7/a;)V

    return-void
.end method
