.class public abstract Ll9/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/c$a;
    }
.end annotation


# static fields
.field public static final n:Ll9/c$a;

.field private static final o:Ll9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll9/c$a;-><init>(Lk9/g;)V

    sput-object v0, Ll9/c;->n:Ll9/c$a;

    sget-object v0, Le9/b;->a:Le9/a;

    invoke-virtual {v0}, Le9/a;->b()Ll9/c;

    move-result-object v0

    sput-object v0, Ll9/c;->o:Ll9/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ll9/c;
    .locals 1

    sget-object v0, Ll9/c;->o:Ll9/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
