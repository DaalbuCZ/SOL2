.class public Lt0/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private n:Ll0/i;

.field private o:Ljava/lang/String;

.field private p:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Ll0/i;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/h;->n:Ll0/i;

    iput-object p2, p0, Lt0/h;->o:Ljava/lang/String;

    iput-object p3, p0, Lt0/h;->p:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lt0/h;->n:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->m()Ll0/d;

    move-result-object v0

    iget-object v1, p0, Lt0/h;->o:Ljava/lang/String;

    iget-object v2, p0, Lt0/h;->p:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Ll0/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
