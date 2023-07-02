.class public final Lz4/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/g;


# instance fields
.field private final a:La5/g;


# direct methods
.method public constructor <init>(La5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/o;->a:La5/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz4/o;->a:La5/g;

    invoke-interface {v0}, La5/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/l;

    invoke-static {v0}, La5/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
