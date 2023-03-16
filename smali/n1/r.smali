.class public final synthetic Ln1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Lo1/c;


# direct methods
.method public synthetic constructor <init>(Lo1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/r;->a:Lo1/c;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln1/r;->a:Lo1/c;

    invoke-interface {v0}, Lo1/c;->a()Lj1/a;

    move-result-object v0

    return-object v0
.end method
