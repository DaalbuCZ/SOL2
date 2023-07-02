.class public final Le3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le3/g;


# instance fields
.field private final a:Lt3/l$a;


# direct methods
.method public constructor <init>(Lt3/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/c;->a:Lt3/l$a;

    return-void
.end method


# virtual methods
.method public a(I)Lt3/l;
    .locals 0

    iget-object p1, p0, Le3/c;->a:Lt3/l$a;

    invoke-interface {p1}, Lt3/l$a;->a()Lt3/l;

    move-result-object p1

    return-object p1
.end method
