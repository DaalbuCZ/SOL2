.class public final synthetic La3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:La3/c$c;

.field public final synthetic o:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(La3/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/d;->n:La3/c$c;

    iput-object p2, p0, La3/d;->o:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La3/d;->n:La3/c$c;

    iget-object v1, p0, La3/d;->o:Landroid/net/Uri;

    invoke-static {v0, v1}, La3/c$c;->a(La3/c$c;Landroid/net/Uri;)V

    return-void
.end method
