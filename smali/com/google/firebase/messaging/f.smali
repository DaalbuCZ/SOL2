.class public final synthetic Lcom/google/firebase/messaging/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/messaging/h;

.field public final synthetic o:Landroid/content/Intent;

.field public final synthetic p:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/h;Landroid/content/Intent;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/f;->n:Lcom/google/firebase/messaging/h;

    iput-object p2, p0, Lcom/google/firebase/messaging/f;->o:Landroid/content/Intent;

    iput-object p3, p0, Lcom/google/firebase/messaging/f;->p:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/f;->n:Lcom/google/firebase/messaging/h;

    iget-object v1, p0, Lcom/google/firebase/messaging/f;->o:Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/firebase/messaging/f;->p:Lt4/j;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/h;->b(Lcom/google/firebase/messaging/h;Landroid/content/Intent;Lt4/j;)V

    return-void
.end method
