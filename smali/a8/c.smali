.class public final synthetic La8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:La8/f;

.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:[Ljava/lang/String;

.field public final synthetic q:Landroid/os/Handler;

.field public final synthetic r:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(La8/f;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/c;->n:La8/f;

    iput-object p2, p0, La8/c;->o:Landroid/content/Context;

    iput-object p3, p0, La8/c;->p:[Ljava/lang/String;

    iput-object p4, p0, La8/c;->q:Landroid/os/Handler;

    iput-object p5, p0, La8/c;->r:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, La8/c;->n:La8/f;

    iget-object v1, p0, La8/c;->o:Landroid/content/Context;

    iget-object v2, p0, La8/c;->p:[Ljava/lang/String;

    iget-object v3, p0, La8/c;->q:Landroid/os/Handler;

    iget-object v4, p0, La8/c;->r:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3, v4}, La8/f;->a(La8/f;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method
