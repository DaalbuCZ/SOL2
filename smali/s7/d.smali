.class public final synthetic Ls7/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/f;


# instance fields
.field public final synthetic a:Ls7/e;

.field public final synthetic b:Ll8/k$d;


# direct methods
.method public synthetic constructor <init>(Ls7/e;Ll8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/d;->a:Ls7/e;

    iput-object p2, p0, Ls7/d;->b:Ll8/k$d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls7/d;->a:Ls7/e;

    iget-object v1, p0, Ls7/d;->b:Ll8/k$d;

    check-cast p1, Lu4/a;

    invoke-static {v0, v1, p1}, Ls7/e;->b(Ls7/e;Ll8/k$d;Lu4/a;)V

    return-void
.end method
