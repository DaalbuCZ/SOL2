.class public final synthetic Ls1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Lt1/c;


# direct methods
.method public synthetic constructor <init>(Lt1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/r;->a:Lt1/c;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/r;->a:Lt1/c;

    invoke-interface {v0}, Lt1/c;->a()Lo1/a;

    move-result-object v0

    return-object v0
.end method
