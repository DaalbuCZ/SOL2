.class public final synthetic Ly1/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly1/o1;


# direct methods
.method public synthetic constructor <init>(Ly1/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/d;->n:Ly1/o1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly1/d;->n:Ly1/o1;

    invoke-static {v0}, Ly1/o1;->u0(Ly1/o1;)V

    return-void
.end method
