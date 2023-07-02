.class public final Lz4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/g;


# instance fields
.field private final a:Lz4/n;


# direct methods
.method public constructor <init>(Lz4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/p;->a:Lz4/n;

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz4/p;->a:Lz4/n;

    invoke-virtual {v0}, Lz4/n;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La5/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lz4/p;->a:Lz4/n;

    invoke-virtual {v0}, Lz4/n;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La5/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
