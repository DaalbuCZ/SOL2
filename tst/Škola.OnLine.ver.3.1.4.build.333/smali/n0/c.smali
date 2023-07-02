.class public final Ln0/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ln0/c;

.field private static final b:Ln0/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/c;

    invoke-direct {v0}, Ln0/c;-><init>()V

    sput-object v0, Ln0/c;->a:Ln0/c;

    sget-object v0, Ln0/f$b;->p:Ln0/f$b;

    sput-object v0, Ln0/c;->b:Ln0/f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln0/f$b;
    .locals 1

    sget-object v0, Ln0/c;->b:Ln0/f$b;

    return-object v0
.end method
