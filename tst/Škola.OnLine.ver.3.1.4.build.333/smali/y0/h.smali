.class public Ly0/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private n:Lq0/i;

.field private o:Ljava/lang/String;

.field private p:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Lq0/i;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/h;->n:Lq0/i;

    iput-object p2, p0, Ly0/h;->o:Ljava/lang/String;

    iput-object p3, p0, Ly0/h;->p:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ly0/h;->n:Lq0/i;

    invoke-virtual {v0}, Lq0/i;->m()Lq0/d;

    move-result-object v0

    iget-object v1, p0, Ly0/h;->o:Ljava/lang/String;

    iget-object v2, p0, Ly0/h;->p:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Lq0/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
