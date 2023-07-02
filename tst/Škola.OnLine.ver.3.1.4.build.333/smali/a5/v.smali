.class public final synthetic La5/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:La5/d0;


# direct methods
.method public synthetic constructor <init>(La5/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/v;->a:La5/d0;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, La5/v;->a:La5/d0;

    invoke-static {v0}, La5/d0;->h(La5/d0;)V

    return-void
.end method
