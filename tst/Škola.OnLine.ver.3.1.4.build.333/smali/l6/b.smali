.class public final synthetic Ll6/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll6/f;


# direct methods
.method public synthetic constructor <init>(Ll6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/b;->a:Ll6/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll6/b;->a:Ll6/f;

    invoke-static {v0}, Ll6/f;->c(Ll6/f;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
