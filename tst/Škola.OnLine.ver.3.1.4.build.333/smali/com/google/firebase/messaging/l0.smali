.class public final synthetic Lcom/google/firebase/messaging/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Z

.field public final synthetic p:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLy4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/l0;->n:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/google/firebase/messaging/l0;->o:Z

    iput-object p3, p0, Lcom/google/firebase/messaging/l0;->p:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/l0;->n:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/firebase/messaging/l0;->o:Z

    iget-object v2, p0, Lcom/google/firebase/messaging/l0;->p:Ly4/j;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/m0;->a(Landroid/content/Context;ZLy4/j;)V

    return-void
.end method
