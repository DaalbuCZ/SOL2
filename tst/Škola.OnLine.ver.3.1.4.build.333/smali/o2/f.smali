.class public final synthetic Lo2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lo2/g;


# direct methods
.method public synthetic constructor <init>(Lo2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/f;->n:Lo2/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo2/f;->n:Lo2/g;

    invoke-static {v0}, Lo2/g;->a(Lo2/g;)V

    return-void
.end method
