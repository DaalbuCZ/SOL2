.class public final synthetic Lcom/google/firebase/messaging/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/messaging/f0;

.field public final synthetic o:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/f0;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/e0;->n:Lcom/google/firebase/messaging/f0;

    iput-object p2, p0, Lcom/google/firebase/messaging/e0;->o:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/e0;->n:Lcom/google/firebase/messaging/f0;

    iget-object v1, p0, Lcom/google/firebase/messaging/e0;->o:Ly4/j;

    invoke-static {v0, v1}, Lcom/google/firebase/messaging/f0;->a(Lcom/google/firebase/messaging/f0;Ly4/j;)V

    return-void
.end method
